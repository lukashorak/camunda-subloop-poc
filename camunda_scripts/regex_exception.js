
var email = execution.getVariable("email");

var regex = /([A-Z]{3,5})/g;
var found = email.match(regex);

if (!found){
  throw new java.lang.Exception("EmailError");
}
