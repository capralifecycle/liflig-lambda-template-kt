# Liflig Lambda Template Kotlin

![Java Badge](https://img.shields.io/badge/java-21-blue?logo=java)
![Kotlin Badge](https://img.shields.io/badge/kotlin--blue?logo=kotlin)

## Documentation

This repo acts as a template for a lambda function based on Kotlin. The template Jenkinsfile matches a
Liflig Delivery Platform based CDK setup

Make sure you edit

- [ ] Change `groupId`, `artifactId` and `name` in POM
- [ ] Change `sonar.projectKey` in POM
- [ ] Rename `.github/workflows/ci.yaml.template` to `ci.yaml`. Update variables at top
- [ ] Update [.ldp.json](.ldp.json)
- [ ] Replace `service.name` and `service.package.prefix`
  in [application.properties](src/main/resources-filtered/application.properties)
- [ ] Replace `no.liflig.example` package name in `src/main` and `src/test`
- [ ] Update this README
- [ ] Remove LICENSE file and Readme's bottom License section if not necessary (i.e. if this is private code)

### Getting started

TODO

#### Tool dependencies

You need to install:

- Maven (or run maven through IntelliJ)
- JDK 21

#### Developer machine setup

TODO

### Running tests

```shell
mvn verify
```

### Deploying

Push to master.

## License

Apache 2.0 Licence. See LICENCE file
