i = 123;
str = "SomeText";
jsonValue = {x: "abc", y:123, in: {deeper: {num: 123, dec: 12.34, str: "abcXyz"}}};
jsonExample = S(JSON.stringify(jsonValue));
execution.setVariable("i", i);
execution.setVariable("str", str);
execution.setVariable("jsonExample", jsonExample );

//json2 = S(JSON.parse({"x": "abc", "y":123, "in": {"deeper": {"num": 123, "dec": 12.34, "str": "abcXyz"}}}));
//execution.setVariable("json2", json2 );