package authentication

type Authenticator interface {
    Authenticate(baseUrl string)
}

type Authentication struct {

}

type DummyAuth struct {

}

func (a Authentication) Authenticate(baseUrl string) {
    switch baseUrl {
    case "http://carts.sock-shop":
    case "http://catalogue.sock-shop":
    case "http://front-end.sock-shop":
    case "kafka://kafka":
    case "http://orders.sock-shop":
    case "http://payment.sock-shop":
    case "http://shipping.sock-shop":
    case "http://user.sock-shop":
    }
}

func (a DummyAuth) Authenticate(baseUrl string) {
}
