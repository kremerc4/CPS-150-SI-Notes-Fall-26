---
marp: true
theme: default
class:
    - invert
paginate: true
math: latex
---

# CPS 150 Review Session #5
Loops

---

# Review Activity

What will this loop output?

``` txt
H
e
l
l
o
```

---

# `For` Loops

Fill in the missing pieces to get the desired output

``` java
for (int i = 1; i < 10; i += 2) {
    System.out.print(i + " ");
}
```

``` java
for (int i = 10; i > 0; i--) {
    System.out.print(i + " ");
}
```

``` java
for (int i = 1; i < 65; i *= 2) {
    System.out.print(i + " ");
}
```

---


# `For` Loops

What happens when we run this code?

You will get a variable not found error and the code will not compile. This is because you are trying to access `i` outside of its defined scope. In the current snippet, `i` only exists within the `for` loop. To work around this, we would need to define `i` outside of the `for` loop. For example:

``` Java
int i;
for (i = 0; i < 5; i++) {
    System.out.println(i + " ");
}

System.out.println("Final Value: " + i); // will print Final Value: 5
```
