package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/users/2'
    }
    response {
        status OK()
        body(["id": 2, "firstName": "Adam"])
        headers {
            contentType(applicationJson())
        }
    }
}
