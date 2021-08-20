# Camunda Scripting

## JSON Path
Nástroj pro vyhledávání v JSON objektu skrz query podobnou XPath

Dokumentace: [JSON Path Java Library](https://github.com/json-path/JsonPath#operators)
Užitečné k debugování JSON Path: [JSON Path Tester](https://jsonpath.com/)

## SPIN JSON
Knihovna použitá v Camunda BPM k zjednodušeí práce s JSONem.


[Camunda Scripting](https://docs.camunda.org/manual/7.15/user-guide/process-engine/scripting/)
### Použití:

#### Script 1 Start:
```
i = 123;
str = "SomeText";
jsonValue = {x: "abc", y:123, in: {deeper: {num: 123, dec: 12.34, str: "abcXyz"}}};
jsonExample = S(JSON.stringify(jsonValue));
execution.setVariable("i", i);
execution.setVariable("str", str);
execution.setVariable("jsonExample", jsonExample );

//json2 = S(JSON.parse({"x": "abc", "y":123, "in": {"deeper": {"num": 123, "dec": 12.34, "str": "abcXyz"}}}));
//execution.setVariable("json2", json2 );
```

#### Script 2 ScriptTask:
```
var x = "Test";
var str = execution.getVariable("str");
y = x + str;
execution.setVariable("y", y);

var jsonValue = execution.getVariable("jsonExample");

//Convert using SpinJson
var jsonExample2 = S(jsonValue);
jsonExample2.prop("city", "Praha")
jsonExample2.prop("in").prop("city", "Praha")

execution.setVariable("jsonExample2", jsonExample2 );

//Use JsonPath
var dec = jsonExample.jsonPath("$.in.deeper.dec").numberValue().toFixed(2);
execution.setVariable("dec", dec );

var num = jsonExample.jsonPath("$.in.deeper.num").numberValue();
execution.setVariable("num", num );

//Use Spin JSON + .element on JsonPath Results
var deeper = S(jsonExample.jsonPath("$.in.deeper").element());
execution.setVariable("deeper", deeper );
```

#### Script 3 Regex validation:
```
var email = execution.getVariable("email");

var regex = /([A-Z]{3,5})/g;
var found = email.match(regex);

//Generic exception to stop processing
if (!found){
  throw new java.lang.Exception("EmailError");
}

//Defined BPMNError (require BoundaryEvent)
if (!found){
  throw new org.camunda.bpm.engine.delegate.BpmnError("SignatureError");
}
```
