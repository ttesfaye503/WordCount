package week4;

importacm.program.*;importjava.util.*;
publicclassCountNames extendsConsoleProgram {
publicvoidrun() {
HashMap<String,Integer> nameMap = newHashMap<String,Integer>();
readNames(nameMap);
printMap(nameMap);
}
privatevoidreadNames(Map<String,Integer> map) {
while(true) {String name = readLine("Enter name: ");
if(name.equals("")) 
break;
Integer count = map.get(name);
if(count == null) {
count = newInteger(1);
} 
else{count = newInteger(count + 1);
}
map.put(name, count);}
}
private void printMap(Map<String,Integer> map) {
Iterator<String> it = map.keySet().iterator();
while(it.hasNext()) {
String key = it.next();
intcount = map.get(key);
println("Entry [" + key + "] has count " + count);
}
}
}
