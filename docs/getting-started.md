<!--docs:
title: "Getting Started"
layout: landing
section: docs
path: /docs/getting-started/
-->

### 1. Depend on our library

Z-Stream is available through Google's Maven Repository.
To use it:

1.  Open the `build.gradle` file for your application.
2.  Make sure that the `repositories` section includes Google's Maven Repository
    `google()`. For example:

    ```groovy
      allprojects {
        repositories {
          google()
          jcenter()
        }
      }
    ```

3.  Add the library to the `dependencies` section:

    ```groovy
      dependencies {
        // ...
        implementation 'com.zeoflow:z-stream:<version>'
        // ...
      }
    ```

Visit [Google's Maven Repository](http://maven.google.com) or
[MVN Repository](https://mvnrepository.com/artifact/com.zeoflow/password-strength)
to find the latest version of the library.

## Contributors

Z_Stream welcomes contributions from the community. Check
out our [contributing guidelines](contributing.md) before getting started.
