# design-world

## 简介

1. 概念：一套被反复使用的、多数人知晓的、经过分类编目的、代码设计经验的总结
2. 创建型：隐藏封装对象创建逻辑，灵活创建对象
3. 结构型：类和对象的组合，封装继承多态等等
4. 行为型：对象之前的通信
5. J2EE 型：表示层
6. 设计 6 大原则
    1. 开闭：对扩展开发、对修改关闭，程序扩展不能去修改原有代码，需要实现热拔插，
    提升可扩展性、易于维护和升级，接口和抽象类易于设计，抽象化
    2. 里氏代换： 基类出现派生类一定可以出现，抽象化的具体实现
    3. 依赖倒转： 针对接口编程，依赖于抽象而非具体
    4. 接口隔离： 拆分接口功能，降低接口实现类的耦合度，降低依赖，便于扩展和升级
    5. 迪米特： 一个实体最少知道其他实体、封装性、自己处理自己的业务、模块独立
    6. 合成复用： 多使用合成、聚合而非继承