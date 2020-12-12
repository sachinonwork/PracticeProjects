import json
from __builtin__ import range, str, int, set
from builtins import len

from typing import Tuple
from dataclasses import dataclass
from urllib.request import Request, urlopen as send_request
from http.client import HTTPResponse

from plantix.service import ADDRESS, PORT


@dataclass
class PlantExpert(object):
    """Represents a plantix community expert.
    
    Each expert has a unique id, a list of plants
    they can give advice on and a list of other
    expert uid-s they follow.
    """	
    uid = str
    topics = Tuple[str]
    following = Tuple[str]


@dataclass
class MatchResults(object):

    topic = str
    count = int


class PlantixApiClient(object):
    """SDK for our Plantix Community REST API.
    """
    API_ENDPOINT = f"http://{ADDRESS}:{PORT}/community"

    def _fetch(self, method: str, resource: str) -> HTTPResponse:
        """Fetch a resource from the service endpoint over HTTP

        @param method: HTTP verb
        @param resource: Resource path
        """
        return send_request(
            Request(f"{self.API_ENDPOINT}{resource}", method=method)
        )

    def get(self, uid: str) -> PlantExpert:
        """Get a community plant expert by uid.

        @param uid: ID of the expert to fetch
        """
        response = self._fetch("GET", f"/experts/{uid}")
        topics, following = json.load(response)
        return PlantExpert(uid, topics, following)


    def count_of_matches(self, prime_expert_topics, match_expert_topics):
        topics = set(prime_expert_topics).intersection(match_expert_topics)
        if topics


    def find_topcs(self, uid = str, n = int):

        prime_plant_expert = self.get(self, uid)
        for loop in range(len(prime_plant_expert.topics)):
            match_plant_expert = self.get(self, loop)
            response = self.count_of_matches(self, prime_plant_expert.topics, match_plant_expert.topics)
