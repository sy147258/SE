# 软件工程实验三：面向对象的系统建模 —— 代码实现

对应任务：star.jmhui.com.cn/p1/411.html（UML 类建模 A1-1 ~ A1-4）

## 目录结构
```
SE/
└── src/se/exp3/
    ├── Demo.java          # 演示主类（验证可编译/运行）
    ├── a1/Thoroughbred.java          # A1-1 马类
    ├── a2/College,Building,Course     # A1-2 学院/楼/课程（聚合+组合）
    ├── a3/School,Department,...        # A1-3 学校领域类图
    └── a4/Customer,Order,...,Payment   # A1-4 网上购物系统
```

## 编译与运行
```bash
cd D:/IDEA/SE
javac -d out src/se/exp3/**/*.java
java -cp out se.exp3.Demo
```

## 对应 UML 类图
4 张类图见实验三报告（202410760221-孙宇-软件工程实验三.docx）：
- A1-1 Thoroughbred
- A1-2 College / Building / Course（聚合空心菱形 + 组合实心菱形 + 约束）
- A1-3 School 领域类图（组合 + 关联多重性）
- A1-4 网上购物系统（5 种支付方式的泛化层次）
