dropwizard-tutorial
===================

Java and Dropwizard framework
Following http://dropwizard.readthedocs.org/en/latest/getting-started.html

#### Build
```
mvn clean
mvn compile
mvn package
java -jar target/helloworld-1.0-SNAPSHOT.jar server hello-world.yml
```

```
INFO  [2014-06-27 01:57:03,263] io.dropwizard.server.ServerFactory: Starting hello-world
INFO  [2014-06-27 01:57:03,328] org.eclipse.jetty.setuid.SetUIDListener: Opened application@2c2f4d91{HTTP/1.1}{0.0.0.0:8080}
INFO  [2014-06-27 01:57:03,330] org.eclipse.jetty.setuid.SetUIDListener: Opened admin@558d8140{HTTP/1.1}{0.0.0.0:8081}
INFO  [2014-06-27 01:57:03,332] org.eclipse.jetty.server.Server: jetty-9.0.z-SNAPSHOT
INFO  [2014-06-27 01:57:03,446] com.sun.jersey.server.impl.application.WebApplicationImpl: Initiating Jersey application, version 'Jersey: 1.18.1 02/19/2014 03:28 AM'
INFO  [2014-06-27 01:57:03,504] io.dropwizard.jersey.DropwizardResourceConfig: The following paths were found for the configured resources:

    GET     /hello-world (com.example.helloworld.resources.HelloWorldResource)

INFO  [2014-06-27 01:57:03,715] org.eclipse.jetty.server.handler.ContextHandler: Started i.d.j.MutableServletContextHandler@28296f7d{/,null,AVAILABLE}
INFO  [2014-06-27 01:57:03,716] io.dropwizard.setup.AdminEnvironment: tasks = 

    POST    /tasks/gc (io.dropwizard.servlets.tasks.GarbageCollectionTask)

INFO  [2014-06-27 01:57:03,720] org.eclipse.jetty.server.handler.ContextHandler: Started i.d.j.MutableServletContextHandler@49284be4{/,null,AVAILABLE}
INFO  [2014-06-27 01:57:03,730] org.eclipse.jetty.server.ServerConnector: Started application@2c2f4d91{HTTP/1.1}{0.0.0.0:8080}
INFO  [2014-06-27 01:57:03,731] org.eclipse.jetty.server.ServerConnector: Started admin@558d8140{HTTP/1.1}{0.0.0.0:8081}
```

#### Result:
* http://127.0.0.1:8080/hello-world
 * {"id":7,"content":"Hello, Stranger!"}
* http://127.0.0.1:8080/hello-world?name=Super%20dropwizard%20user
 * {"id":6,"content":"Hello, Super dropwizard user!"}
* Operational Menu http://127.0.0.1:8081/
 * Metrics, Ping, Threads, Healthcheck
