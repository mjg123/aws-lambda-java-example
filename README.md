# Quick example of an AWS lambda function in Java

  1. Clone this repo
  2. `./mvnw clean package` to build it
  3. Upload the file `target/aws-lambda-demo-0.0.1-SNAPSHOT.jar` in the Lambda console
  4. The handler needs to be `org.springframework.cloud.function.adapter.aws.FunctionInvoker::handleRequest`
  5. Test the lambda with some JSON like this:

```json
{"value": "assfjask"}
```

Note: the structure of that JSON has to match the AwsEvent class defined in `src/main/java/lol/gilliard/awslambdademo/AwsLambdaDemoApplication.java` - so this won't work for most events but you can use the Test tab in the AWS console to supply whatever JSON you need.
