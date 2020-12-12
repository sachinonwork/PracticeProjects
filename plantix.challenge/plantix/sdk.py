import json

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
    uid: str
    topics: Tuple[str]
    following: Tuple[str]


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
