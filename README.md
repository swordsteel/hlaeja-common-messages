# Hlæja Common Messages

Classes for the common, messages to share, Classes for the systems, harmonized in air, Classes for the services, bound by their role, Bound to one purpose, to transfer the whole, And in communication bind them, from source to final state, In the realm of services, where connections propagate.

## Releasing library

Run `release.sh` script from `master` branch.

## Publishing library

### Publish library locally

```shell
./gradlew clean build publishToMavenLocal
```

### Publish library to repository

```shell
./gradlew clean build publish
```

### Global gradle properties

To authenticate with Gradle to access repositories that require authentication, you can set your user and token in the `gradle.properties` file.

Here's how you can do it:

1. Open or create the `gradle.properties` file in your Gradle user home directory:
   - On Unix-like systems (Linux, macOS), this directory is typically `~/.gradle/`.
   - On Windows, this directory is typically `C:\Users\<YourUsername>\.gradle\`.
2. Add the following lines to the `gradle.properties` file:
    ```properties
    repository.user=your_user
    repository.token=your_token_value
    ```
   or use environment variables `REPOSITORY_USER` and `REPOSITORY_TOKEN`
