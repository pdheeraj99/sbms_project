## Question 1:
### <span style="color:blue;">Use @Setter and @Getter and don't use @Data. Why?</span>

**Answer**

Using <span style="color:blue;">`@Setter`</span> and <span style="color:blue;">`@Getter`</span> separately instead of <span style="color:blue;">`@Data`</span> provides more control and flexibility over the generation of setter and getter methods.

<span style="color:blue;">`@Data`</span> is a shortcut annotation that automatically generates getter and setter methods for all fields, as well as other methods like `toString()`, `equals()`, and `hashCode()`. While this can be convenient, it may not always be desirable.

By using <span style="color:blue;">`@Setter`</span> and <span style="color:blue;">`@Getter`</span> separately, you can:

- **Control which fields get setter and getter methods**: Specify <span style="color:blue;">`@Setter`</span> and <span style="color:blue;">`@Getter`</span> only on fields where needed.
- **Customize the names of the setter and getter methods**: Modify method names as necessary.
- **Add additional logic or annotations to the setter and getter methods**: Enhance methods with additional functionality or constraints.

In this specific case, using <span style="color:blue;">`@Setter`</span> and <span style="color:blue;">`@Getter`</span> separately allows you to keep the getter and setter methods separate, which can be useful for finer-grained control over access to the fields.

---

# Question 2:
### <span style="color:blue;">How can Lombok annotations be used to control getter and setter methods in a Java class?</span>

**Answer**

1. **Using <span style="color:blue;">`@Setter`</span> and <span style="color:blue;">`@Getter`</span> instead of <span style="color:blue;">`@Data`</span>**:
    - **Code**:
      ```java
      @Entity
      @Setter
      @Getter
      public class Customer {
          ...
      }
      ```
    - **Explanation**: Using <span style="color:blue;">`@Setter`</span> and <span style="color:blue;">`@Getter`</span> separately provides more control over the generation of setter and getter methods.

2. **Controlling which fields get setter and getter methods**:
    - **Code**:
      ```java
      private @Getter String name;
      private @Setter String email;
      ```
    - **Explanation**: Placing <span style="color:blue;">`@Getter`</span> and <span style="color:blue;">`@Setter`</span> on individual fields controls which fields get getter and setter methods generated.

3. **Default behavior of Lombok**:
    - **Code**:
      ```java
      public class Customer {
          private String name;
          private String email;
      }
      ```
    - **Explanation**: If you don't specify <span style="color:blue;">`@Getter`</span> and <span style="color:blue;">`@Setter`</span> at the field or class level, Lombok will not generate getter and setter methods for the fields.

4. **Opting out of getter and setter methods at the class level**:
    - **Code**:
      ```java
      @Entity
      public class Customer {
          private String name;
          private String email;
      }
      ```
    - **Explanation**: If you don't specify <span style="color:blue;">`@Getter`</span> and <span style="color:blue;">`@Setter`</span> at the class level, Lombok will not generate getter and setter methods for any fields, unless you explicitly add them at the field level.

5. **Using <span style="color:blue;">`@Transient`</span> to exclude fields from getter and setter methods**:
    - **Code**:
      ```java
      private @Transient String mobileNumber;
      ```
    - **Explanation**: Using <span style="color:blue;">`@Transient`</span> on a field excludes it from getting getter and setter methods generated.
