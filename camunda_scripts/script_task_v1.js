var x = "Test";

var str = execution.getVariable("str");
y = x + str;
execution.setVariable("y", y);

var jsonValue = execution.getVariable("jsonExample");

var jsonExample2 = S(jsonValue);


jsonExample2.prop("city", "Praha")
jsonExample2.prop("in").prop("city", "Praha")

execution.setVariable("jsonExample2", jsonExample2 );

var dec = jsonExample.jsonPath("$.in.deeper.dec").numberValue().toFixed(2);
execution.setVariable("dec", dec );

var num = jsonExample.jsonPath("$.in.deeper.num").numberValue();
execution.setVariable("num", num );

var deeper = S(jsonExample.jsonPath("$.in.deeper").element());
execution.setVariable("deeper", deeper );