# Z-Stream

## Intro
Z-Stream is an HTTP library that makes networking for Android apps easier and, most importantly, faster.

## Getting Started
For information on how to get started with Z-Stream,
take a look at our [Getting Started](docs/getting-started.md) guide.

## Submitting Bugs or Feature Requests
Bugs or feature requests should be submitted at our [GitHub Issues section](https://github.com/zeoflow/z-stream/issues).

## How does it work?
### 1. Depend on our library

Z-Stream for Android is available through Google's Maven Repository.
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

### 2. Activity/Fragment Class
`MainActivity.java`

```java
public class MainActivity extends AppCompatActivity
{
    //..
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        //..
        String url = "opensource.zeoflow.com/zstream";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
            (Request.Method.GET, url, null, new Response.Listener<JSONObject>()
            {

                @Override
                public void onResponse(JSONObject response)
                {
                    textView.setText("Response: " + response.toString());
                }
            }, new Response.ErrorListener()
            {

                @Override
                public void onErrorResponse(ZStreamError error)
                {
                    // TODO: Handle error

                }
            });

        // Access the RequestQueue through your singleton class.
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest);
        //..
    }
    //..
}
```

## License
    Copyright 2020 ZeoFlow
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
      http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
