# Exercise 5: Equality Predictions (S17 homework)

Use these variables for every row:

```java
String a = "Java";
String b = a;
String c = new String("Java");
String d = "java";
String e = null;
```

**Predict first.** Fill in the Predicted column for all ten rows BEFORE you run anything. A blank prediction scores zero. For compareTo rows write only negative, zero or positive.

| # | Expression | Predicted | Actual | Missed? |
|---|---|---|---|---|
| 1 | `a == b` | true  | true| |
| 2 | `a == c` |  false| false| |
| 3 | `a.equals(c)` |true |true | |
| 4 | `a.equals(d)` | false| flase| |
| 5 | `a.toLowerCase().equals(d)` | true| true| |
| 6 | `a.compareTo(c)` | 0| 0| |
| 7 | `a.compareTo(d)` | -32|-32 | |
| 8 | `"apple".compareTo("banana")` |-1 |-1 | |
| 9 | `"b".compareTo("a")` | 1| 1| |
| 10 | `a.equals(e)` | false| false| |

Run each one in a scratch Java file and fill in Actual. Mark every miss.

## For each miss: one sentence
Say whether it was `==` versus `equals`, or the sign of `compareTo`.

-

## One safe line
Write ONE line of code that is true when `s` matches "yes" and never crashes, even if `s` is `null`.

```java
"yes".equals(s)
```

## Before tomorrow
Peer code review is next class. Make sure `src/EmailParser.java` is pushed to your fork.
