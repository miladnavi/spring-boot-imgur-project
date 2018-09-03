# spring-boot-imgur-project
#### This repo is my first projcet on spring-boot framework to fetch data from imgur API and cache them by redis to acceleration response time for user request.
 + Imgur: <pre><code> https://apidocs.imgur.com/</code></pre>
 
##### Configuration and Start the Server:
+ Install and run Redis on your machine: <pre><code> https://redis.io/ </code></pre>

+ Make sure that your redis server running locally and configured on port: <code> 6379 </code>

+ Install dependencies: 
  <pre><code> mvn clean install</code></pre>
+ Run: 
  <pre><code> mvn spring-boot:run</code></pre>
  
  
##### How to use:
+ Make request to: 
  <pre><code>localhost:8080/image/{id}</code></pre>
+ e.g. image id: <code>zyoc4U0</code>
