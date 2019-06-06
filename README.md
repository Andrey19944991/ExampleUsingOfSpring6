# ExampleUsingOfSpring6
отличия от ExampleUsingOfSpring5:
значения в сеттер передаются через значения, находящиеся в файле (ключ - значение).
Также в конфигурационном файле пишется импорт:
```html
<context:property-placeholder location="classpath:musicPlayer.properties"/>
```
И чтобы достать эти значения, то нужно написать:
```html
 <property name="name" value="${musicPlayer.name}"/>
```
а в самом файле написано:
musicPlayer.name=Some name
