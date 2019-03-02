# Table of Contents
1. [Indentation](#indent)
2. [Naming Conventions](#naming)
3. [Declarations](#declarations)
4. [Statements](#statements)
5. [Modifiers](#modifiers)

## Indentation <a name="indent"></a>

Use 4 spaces per indentation

## Naming Conventions <a name="naming"></a>

### Names

* Use all-lowercase ASCII letters for `package names`.
* Use UpperCamelCase for `type` names.
* Use UpperCamelCase for `enum` values.
* Use camelCase for `method` names.
* Use camelCase for `property` names and `local variables`.
* Use all uppercase with words separated by underscores ("_") for `constants`.


### Interfaces

* Use I prefix for interfaces.

```java
interface ISample {

    void add(int a,int b);
    
}
```

## Declarations <a name="declarations"></a>

### Variables

* Every variable declaration (field or local) declares only one variable: declarations such as `int a, b;` are not used.
* Local variable declarations typically have initializers, or are initialized immediately after declaration.

### Classes, Interfaces and Methods

* No space between a method name and the parenthesis (`(`) starting its parameter list.
* Open brace (`{`) appears at the end of the same line as the declaration statement.
* Closing brace (`}`) starts a line by itself indented to match its corresponding opening statement, except when it is a null statement the (`}`) should appear immediately after the (`{`).
* Methods are separated by a blank line.

```java
class Demo {
    int varA;
    int varB;
    
    public Demo() {
        varA = 1;
        varB = 2;
    }
    
    public int getVarA() {
        return varA;
    }
    
    public void setVarA(int value) {
        varA = value;
    }
    
    public void empty() {}

}
```

## Statements <a name="statements"></a>

#### `for` statements

A `for` statement should have the following form:

```java

for (initialization; condition; update) {
    statements;
}

// For-each way
for (variable : collection) {
    statements;
}

// Empty for statement
for (initialization; condition; update);

```

#### `while` statements

A `while` statement should have the following form:

```java
while (condition) {
    statements;
}

// Empty while
while (condition);

```

#### `do-while` statements

A `do-while` statement should have the following form:

```java
do {
    statements;
} while(condition);
```

#### `try-catch` statements

A 'try-catch' statement should have the following form:

```java
try {
    statements;
} catch (ExceptionClass e) {
    statements;
}
```

A `try-catch` statement may has multiple catch clause:

```java

// Incorrect
try {
    statements;
} catch (ExceptionClass e) {
    statements;
} catch (AnotherExceptionClass e) {
    statements;
}

// Correct
try {
    statements;
} catch (ExceptionClass |  AnotherExceptionClass e) {
    statements;
}
```



## Modifiers <a name="modifiers"></a>

Classes and member modifiers, should appear in the order recommended by the Java Language Specification:

```java
public protected private abstract default static final transient volatile synchronized native strictfp
```
