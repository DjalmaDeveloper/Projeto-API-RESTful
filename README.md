# Projeto Java API RESTful

## Diagrama de Classes
```mermaid
classDiagram
    class User {
        -String name
        -Account account
        -Feature[] features
        -Card card
        -News[] news
    }

    class Account {
        -String number
        -String agency
        -Float balance
        -Float limit
    }

    class Card {
        -String number
        -Float limit
    }

    class Feature {
        -String icon
        -String description
    }

    class News {
        -String icon
        -String description
    }

    User "1" *--> "1" Account : has
    User "1" *--> "1" Card : has
    User "1" *--> "N" Feature : has many
    User "1" *--> "N" News : has many
```
