# product-demo-custom-1
First product customization

- no customization in the controller layer, all the entry point remain the same. Services are overwritten to implement a different type of business, and the new component as injected as primary implementation
    - the DAO overwrite the existing one from the product
    - the database service re-implement the interface
    - the component are injected in the controller without any changes there
    - the boot component pom dependencies are implemented to include the property libraries