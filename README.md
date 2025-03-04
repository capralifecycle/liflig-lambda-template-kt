# Liflig Lambda Template Kotlin

> [!WARNING]
> Try the new Maven Archetype to quickly generate the project with placeholders filled in.
> Visit https://github.com/capralifecycle/liflig-baseline-archetypes, follow the _Install_ section
> and use then _Baselines → lambda-baseline-archetype_ command.

## Documentation

This repo acts as a template for an AWS Lambda function written with Kotlin.

Make sure you edit:

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
