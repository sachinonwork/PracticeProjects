package in.co.myledger

import groovyx.net.http.RESTClient
import spock.lang.Specification

class WalletServicesSpec extends Specification {

    def localServer = "http://localhost:8080"
    def restClient = new RESTClient(localServer);

    def "Create a transaction and check if service give 201 response"() {
        given: "Valid request for /wallet/transaction"

        when: "request to create a transaction"
        def response = restClient.post([path:'/create', query:[amount:10,
                                                               currency:'INR',
                                                               expenseDesc:'snacks in evening' ]])

        then: "create transaction gives success and 201 response"
            with(response) {
                status == 201
                contentType == "application/json"
            }
    }
}