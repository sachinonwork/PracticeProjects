from unittest import TestCase
from plantix.sdk import PlantixApiClient

class PlantixApiClientTest(TestCase):

    def test_elements_match_counts(self):
        prime_expert_topics = ["fix", "23jk", "place"]
        match_expert_topics = ["2938", "fix"]
        self.plantix_client = PlantixApiClient()
        match_result = self.plantix_client.count_of_matches(self, prime_expert_topics, match_expert_topics)

        assert 1 == match_result


