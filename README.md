最新更新点：（此处为记录短暂想法，后期排版改动后该处内容会逐条删除）
项目参考学习c语言中文网下的设计模式文章进行，链接地址http://c.biancheng.net/view/1380.html
目前以java作为编写语言，后期尝试添加python、c语言版本
#######
UML
·设计软件蓝图的可视化建模语言
·定义用例图、类图、对象图、状态图、活动图、时序图、协作图、构件图、部署图等
可见性：
    + public
    - private
    # protected
    ～ friendly
UML表示操作：
【可见性】名称(参数列表)【：返回类型】   => +display():void
接口：带名称的小圆圈表示
类图class diagram：用来显示系统中的类、接口、协作以及它们之间的静态结构和关系的一种静态模型。用于描述软件系统的结构化设计，简化对软件系统的理解，是系统分析与设计阶段的重要产物，也是系统编码与测试的重要模型依据。
类之间的关系：类与类之间的耦合度从弱到强排列，uml中的类图关系：
依赖关系
    依赖关系Dependency是一种使用关系，它是对象之间耦合度最弱的一种关联方式，是临时性关联。
    UML类图中，依赖关系使用带箭头的虚线表示，箭头从使用类指向被依赖的类。

关联关系
    关联关系Association是对象之间的一种引用关系，用于表示一类对象与另一类对象之间的联系。
    关联关系是类与类之间最常用的一种关系，分为一般关联关系、聚合关系和组合关系：
        关联可以是双向的，也可以单向。双向关联可以用带两个箭头或者没有箭头的实线表示，单向关联用带一个箭头实线表示，箭头从使用类指向被关联的类，也可以在关联线的两端标注角色名，代表两种不同的角色。
        聚合关系 aggregation关系是关联关系的一种，是强关联关系，是整体和部分之间的关系，是has-a的关系。聚合关系通过成员对象实现，其中成员对象是整体对象的一部分，但是成员对象可以脱离整体对象而独立存在。（例如学校、老师） 聚合关系用空心菱形的实线表示，菱形指向整体。
        组合关系 表示类之间的整体与部分的关系，但是是一种更强烈的聚合关系，是cxmtains-a关系。组合关系中，整体对象可以控制部分对象的生命周期，一旦整体不存在，部分对象也将不存在，部分对象不能脱离整体对象而存在。（头和嘴） 组合关系用带实心菱形的实线来表示，菱形指向整体。       
泛化关系 generalization 是对象之间耦合度最大的一种关系，表示一般与特殊的关系，是父类与子类之间的关系，是一种继承关系，是is-a的关系。泛化关系用带空心三角箭头的实线表示，箭头从子类指向父类。实现代码时，使用面向对象的继承机制来实现泛化关系。
实现关系 实现关系realization是接口与实现类之间的关系。类实现了接口，类中的操作实现了接口中所有声明的所有的抽象操作。实现关系用带空心三角箭头的虚线来表示，箭头从实现类指向接口。

#######
设计模式
·创建型模式：
    提供了一种在创建对象的同时隐藏创建逻辑的方式，避免使用new实例化对象。使程序在判断针对某个给定实例需要创建哪些对象时更加灵活
    	>工厂方法模式
    	模式的应用场景：
    	>>客户只知道创建产品的工厂名，不知道具体的产品名。
    	>>创建对象的任务由多个具体子工厂中的某一个完成，而抽象工厂只提供创建产品的接口。
    	>>客户不关心创建产品的细节，只关心产品的品牌。
	    ·定义：定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂类当中。满足创建型模式中要求的"创建与使用相分离"的特点。把被创建的对象称为产品，把创建产品的对象成为工厂。如要创建的产品不多，只需要一个工厂类就可以，此模式叫做简单工厂模式，简单工厂模式不属于gof23种经典模式，他的缺点是增加新产品时会违背开闭原则。“工厂方法模式”是对简单工厂模式的进一步抽象化，其好处是可以使系统在不修改原来代码的情况下引进新的产品，即满足开闭原则。
	    ·工厂方法模式优点：
	    >用户只需要知道具体工厂的名称就可以得到所要的产品，无需知道产品的具体创建过程；
	    >在系统增加新的产品时只需要添加具体产品类和对应的具体工厂类，无需对原工厂进行任何修改，满足开闭原则；
	    ·工厂方法模式缺点：
	    >每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类，增加系统的复杂度。
	    ·模式的结构与实现：工厂方法模式由抽象工厂、具体工厂、抽象产品和具体产品等4个要素构成。
	    ·模式的结构：
		工厂模式的主要角色：
		1.抽象工厂abstract factory：提供创建产品的接口，调用者通过它访问具体工厂的工厂方法new Product()来创建产品
		2.具体工厂concrete factory:主要实现抽象工厂中的抽象方法，完成具体产品的创建
		3.抽象产品product：定义了产品规范，描述了产品的主要特性和功能
		4.具体产品concrete product：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。
	    ·模式的实现：
            public class AbstractFactoryTest{
                public static void main(String[] args){
                    try{
                        Product a;
                        AbstractFactory af;
                        af = (AbstractFactory) ReadXML1.getObject();
                        a = af.newProduct();
                        a.show();
                    }catch(Exception e){
                        System.out.println(e,getMessage());
                    }
                }
            }
            //抽象接口：提供产品的接口
            interface Product{
                public void show();
            }
            //具体产品1:实现抽象产品中的抽象方法
            class ConcreteProduct1 implements Product{
                public void show(){
                    System....
                }
            }
            //具体产品2
            class ConcreteProdut2 implements Prouct{
                public void show(){
                    System....
                }
            }
            //抽象工厂：提供了产品的生成方法
            interface AbstractFactory{
                public Product newProduct();
            }
            //具体工厂1:实现了产品的生成方法
            class ConcreteFactory1 implements AbstractFactory{
                public Product newProduct(){
                    System.out.println("具体工厂1生成-->具体产品1...");
                    return new ConcreteProduct1();
                }
            }
            //具体工厂2:实现了产品的生成方法
            class ConcreteFactory2 implements AbstractFactory
            {
                public Product newProduct()
                {
                    System.out.println("具体工厂2生成-->具体产品2...");
                    return new ConcreteProduct2();
                }
            }
            //方法用于从xml配置文件中提取具体类类名，并返回一个实例对象
            class ReadXML1{
                pulic static object getObject(){
                try{
                    //创建文档对象
                        DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
                        DocumentBuilder builder=dFactory.newDocumentBuilder();
                        Document doc;                           
                        doc=builder.parse(new File("src/FactoryMethod/config1.xml"));        
                        //获取包含类名的文本节点
                        NodeList nl=doc.getElementsByTagName("className");
                        Node classNode=nl.item(0).getFirstChild();
                        String cName="FactoryMethod."+classNode.getNodeValue();
                        //System.out.println("新类名："+cName);
                        //通过类名生成实例对象并将其返回
                        Class<?> c=Class.forName(cName);
                          Object obj=c.newInstance();
                        return obj;
                     }  
                     catch(Exception e)
                     {
                               e.printStackTrace();
                               return null;
                     }
                    }catch(){
                        //XX
                    }
                }
            }
            ·模式的扩展
                当需要生成的产品不多且不会增加，一个具体工厂类就可以完成时，可以删除抽象工厂类。此时工厂方法模式将退化到简单工厂模式。
        >抽象工厂模式 abstractFactory
            工厂方法模式只考虑生成同登记的产品，实际中需要综合型工厂。抽象工厂模式是工厂模式的升级版本，工厂模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品。
            ·定义：是一种为访问类提供一个创建一组相关或者相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构。
            ·使用的满足条件：
                系统中有多个产品族，每个具体工厂创建同一族但属于不同等级结构的产品
                系统一次只能消费其中某一族产品，即同族的产品一起使用
            抽象工厂模式除了具有工厂方法模式的优点外，可以在类的内部对产品族中相关联的多等级产品共同管理，而不必专门引入多个新的类来进行管理。当增加一个新的产品族时不需要修改源代码，满足开闭原则。
            组成结构：
                ·抽象工厂 提供创建产品接口，包含多个创建产品的方法new Product()，可创建多个不同等级的产品
                    interface AbstractFactory{
                        public Product1 newProduct1();
                        public Product2 newProduct2()；
                    }
                ·具体工厂 实现抽象工厂中的多个抽象方法，完成具体产品的创建
                    class ConcreteFactory1 implements AbstractFactory{
                        public Product1 newProduct1(){
                            System.out.println("具体工厂 1 生成-->具体产品 11...");
                            return new ConcreteProduct11();
                        }
                        public Product2 newProduct2(){
                             System.out.println("具体工厂 2 生成-->具体产品 21...");
                             return new ConcreteProduct21();
                                            }
                    }
                ·抽象产品 定义产品规范，描述产品的主要特性和功能，抽象工厂模式有多个抽象产品
                ·具体产品 实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间是多对一关系
            应用场景：
                ·早应用于创建不同操作系统的视窗构件。
                ·当需要创建的对象是一系列相互关联或者相互依赖的产品族时
                ·系统中有多个产品族，但每次只使用其中的某一族产品
                ·系统中提供了产品的类库，且所有产品的接口相同，客户端不依赖产品实例的创建细节和内部结构
            扩展：抽象工厂模式的扩展有一定的开闭原则倾斜性：
                ·当增加一个新的产品族时只需要增加一个新的具体工厂，不需要修改源代码，满足开闭原则
                ·当产品族中需要增加一个新种类的产品时，则所有的工厂类都需要进行修改不满足开闭原则
        >单例模式
            ·为节省资源、保证数据内容的一致性，对某些类要求只能创建一个实例，即单例模式
            单例模式定义：一个类只有一个实例，且该类自行创建这个实例的一种模式。
            单例使用场景：Windows 的回收站、操作系统中的文件系统、多线程中的线程池、显卡的驱动程序对象、打印机的后台处理服务、应用程序的日志对象、数据库的连接池、网站的计数器、Web 应用的配置对象、应用程序中的对话框、系统中的缓存等常常被设计成单例。
            特点：
                1 单例只有一个实例对象
                2 该单例对象必须由单例类自行创建
                3 单例类对外提供一个访问该单例的全局访问点
            单例模式的结构与实现
                普通类的构造函数为pulic，外部类可用"new 构造函数（)"的方式来生成多个实例。当构造函数为private时，外部类无法调用，此时必须定义一个静态私有实例，并向外提供一个静态的公有函数用于创建或获取该静态私有实例。
                结构：
                    单例类：包含一个实例且能自行创建这个实例的类
                    访问类：使用单例的类
                实现：
                    懒汉：类加载时没有生成单例，只有当第一次调用getinstance方法时才去创建这个单例
                    public class LazySingleton {
                        private static volatile LazySingleton instance = null;//保证instance在所有线程中同步
                        private LazySingleton(){}//private避免类在外部被实例化
                        public static synchronized LazySingleton getInstance() {
                            //getInstance方法前加同步
                            if(instance==null) {
                                instance = new LazySingleton();
                            }
                            return instance;
                        }  
                    }
                    注意：编写多线程pro时，不要删除关键字volatile和synchronized，否则将存在线程非安全问题。但是每次访问都要同步，会影响性能，且小号更多资源，此为懒汉模式缺点。
                    饿汉：类一旦加载就创建一个单例，getinstance之前单例就已经存在
                    public class HungrySingleton {
                        private static final HungrySingleton instance = new HungrySigleton();
                        private HungrySingleton() {}
                        public static HungrySingleton getInstance() {
                            return instance;
                        }
                    }
                    注意：饿汉模式在类创建时就以创建好一个静态的对象供系统使用，以后不再改变，是线程安全。
                    应用场景：某类只要求生成一个对象/当对象需要被共享的场合，为了节省内存，加快对象访问速度/某类需要频繁实例化，而创建对象又需要频繁销毁，如线程池、网络连接池
                    单例模式扩展：有限的多例模式->生成有限个实例并保存在ArrayList中，客户需要时可随机获取。
        >建造者模式 Builder
            建造者于工厂模式关注点不同，建造者模式注重零部件的组装过程，工厂方法模式注重零部件的创建过程，二者可结合使用
            ·定义：指将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示。
            ·优点：
                >各个具体的建造者相互独立，有利于系统库扩展
                >客户端不必知道产品内部组成的细节，便于控制细节风险
            ·缺点：
                >产品的组成必须相同，限制了使用范围
                >若产品的内部变化复杂，该模式会增加很多的建造者类
            结构与实现：
                模式结构：
                    1.产品角色 包含多个组成部件的复杂对象，由具体建造者创建各个部件
                    2.抽象建造者 是一个包含创建产品各个子部件抽象方法的接口，通常还包含一个返回复杂产品的方法getResult()
                    3.具体建造者 实现Builder接口，完成复杂产品的各个部件的具体创建方法
                    4.指挥者 调用建造者对象中的部件构造与装配方法完成复杂对象的创建，在指挥者中不涉及具体产品的信息
                    class Product{
                        private String PartA;
                        private String PartB;
                        private String PartC;
                        public void setPartA(String partA){
                            this.partA = partA;
                        }
                        public void setPartB(String partB){
                            this.partB = partB;
                        }
                        public void setPartC(String partC){
                            this.partC = partC;
                        }
                        public void show(){
                        //显示产品特性
                        }
                    }
                    abstract class Builder{
                        //创建产品对象
                        protected Product product = new Product();
                        public abstract void buildPartA();
                        public abstract void buildPartB();
                        public abstract void buildPartC();
                        public Product getResult(){//返回产品对象
                            return product;
                        }
                    }
                    public class ConcreteBuilder extends Builder{
                        public void buildPartA(){
                            product.setPartA("jianzao a");
                        }
                        public void buildPartB(){
                            product.setPartB ("jianzao b");
                        }
                        public void buildPartC(){
                            product.setPartC("jianzao c");
                        }
                    }
                    class Director{
                        private Builder builder;
                        public Director(Builder builder){
                            this.builder = builder;
                        }
                        //产品构建与组装方法
                        public Product construct(){
                            builder.buildPartA();
                            builder.buildPartB();
                            builder.buildPartC();
                            return builder.getResult();
                        }
                    }
                    public class Client{
                        public static void main(String[] args){
                            Builder builder = new ConcreteBuilder();
                            Director director = new Director(builder);
                            Product product = director.construct();
                            product.show();
                        }
                    }
                模式的应用场景：
                    1.创建的对象比较复杂，由多个部件构成，各部件面临复杂的变化，但构件间的建造顺序是稳定的。
                    2.创建复杂对象的算法独立于该对象的组成部分以及它们的装配方式，即产品的构件过程和最终表示是独立的。
                模式的扩展：建造者模式在应用中可根据需要改变，若创建的产品种类只有一种，只需要一个具体的建造者，此时可以省略抽象建造者、甚至省略指挥者角色
        >原型模式
            某些系统中存在大量或者相类似对象的创建问题，用传统的构造函数来创建对象，会比较复杂而且耗时耗资源。原型模式定义：用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或类似的新对象。
            结构与实现：
                java提供来clone()方法，所以实现原型模式很简单。
                ·模式的结构：
                    包括以下主要角色：
                        1.抽象原型类：规定了具体原型对象必须实现的接口。
                        2.具体原型类：实现抽象原型类的clone()方法，它是可被复制的对象。
                        3.访问类：使用具体原型类中的clone（）方法来复制新的对象。
                ·模式的实现：
                    原型模式的克隆分为浅克隆和深克隆，java中的object类提供了浅克隆的clone()，具体原型类只要实现cloneable接口就可以实现对象的浅克隆，此处的cloneable接口就是抽象原型类代码：
                    //具体原型类
                    class Realizetype implements Cloneable {
                        Realizetype{
                            xxx
                        }
                        public Object clone() throws CloneNotSupportException{
                            return (Realizetype)super.clone();
                        }
                    }
                    //原型模式的测试类-访问类
                    public class PrototypeTest{
                        public static void main(String[] args) throws CloneNotSupportException{
                            Realizetype obj1 = new Realizetype();
                            Realizetype obj2 = (Realizetype)obj1.clone();
                            xxx
                        }
                    }
            ·原型模式的应用场景：
            >对象之间相似或相同，即只是有个别几个属性不同的时候。
            >对象的创建过程比较麻烦，但复制比较简单的时候。
            ·原型模式的扩展：
            可扩展为带原型管理器的原型模式，在原型模式的基础上增加一个原型管理器prototypemanager类。该类用hashmap保存多个复制的原型，client类可以通过管理器的get(string id)方法从map中获取复制的原型。
·结构型模式：描述如何将类或对象按某种布局组成更大的结构。分为类结构型模式和对象结构型模式，类结构型模式采用继承机制来组织接口和类，对象结构型模式采用组合或聚合来组合对象。组合关系或聚合关系比继承关系耦合度低，故对象结构型模式比类结构型模式更灵活。
    关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。
        >适配器模式 Adapter
            将一个类的接口转换成客户希望的另一个接口，使原本由于接口不兼容而不能在一起的类能一起工作
            定义：将一个类接口转换为被希望的另一个接口，是原先由于接口不兼容不可一起工作的类进行合作。、
                分为类结构型模式（耦合度高）、对象结构型模式
            优点：
                客户端可透明调用目标接口
                复用现存的类，不许修改原有代码而重用现有的适配者类
                将目标类和适配类解耦，解决适配器的实现过程比较复杂
            缺点：
                对类适配器，更换适配器过程复杂
            结构：
                1 目标接口：当前系统业务期待的接口，可抽象类或接口
                2 适配者类：是被访问和适配的现存组件库中的组件接口
                3 适配器类：一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
            应用场景：
                ·历史系统存在满足新系统功能需求的类，但该类和新系统的接口不一致
                ·使用第三方提供的组件，但组件接口定义和自己要求的接口定义不同
            扩展：
                可扩展为双向适配器模式，双向适配器既可以把适配者接口转换成目标接口，也可反过来。
        >桥接模式 Bridge 
            某些类具备多个维度的数据时，使用继承会导致对应的子类多，扩展困难。
            特点：
                将抽象与现实分离，使它们可以独立变化。用组合关系代替继承关系来实现，降低抽象和实现这两个可变维度的耦合度。
            优点：
                由于抽象与实现分离，扩展能力强
                其实现细节对客户透明
            缺点：
                聚合关系建立在抽象层，要求开发者对抽象化进行设计和编程，增加设计和理解难度
            结构：将抽象化部分与实现化部分分开，取消二者继承关系，改用组合关系
                1 抽象化角色 Abstract：定义抽象类，并包含一个对实现化对象的引用
                2 扩展抽象化角色 ：抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法
                3 实现化角色：实现化角色的接口，供扩展抽象化角色调用
                4 具体实现化角色：给出实现化角色的具体实现
            应用场景：
                1 当一个类存在两个独立变化的维度，且这两个维度都需要进行扩展时
                2 当一个系统不希望使用继承或者因为多层次继承导致系统类的个数急剧增加时
                3 当一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性时
            扩展：
                开发时桥接可与适配器联合，当桥接实现化角色的接口与现有类的接口不一致时，可以在二者中定义一个适配器将二者连接起来
        >过滤器模式
        >组合模式 Composite 分为透明式和安全式的组合模式
            部分-整体模式，将对象组合成树状层次结构，使用户对单个对象和组合对象具有一致的访问性
            优势：
                ·组合模式使客户端代码可一致地处理单个对象和组合对象，无需关心自己处理地是单个对象还是组合对象，简化客户端代码
                ·更易在组合内加入新的对象，客户端不会因加入新对象更改代码，满足开闭原则。
            缺点：
                ·设计复杂，客户端需要花时间理清类之间的层次关系
                ·不易限制容器中的构件
                ·不易用继承的方法来增加构件的新功能
            结构：
                1 抽象构件角色：Component
                    作用是为树叶构件和树枝构件声明公共接口，并实现他们的默认行为。
                    在透明式的组合模式中抽象构件还声明访问和管理子类的接口；
                    在安全式的组合模式中不声明访问和管理子类的接口，管理工作由树枝构件完成
                2 树叶构件角色：Leaf
                    组合中的叶节点对象，没有子节点，用于实现抽象构件角色中声明的公共接口
                3 树枝构件角色：Composite
                    组合中的分支节点对象，有子节点。它实现了抽象构件角色中声明的接口。
                    主要作用是存储和管理子部件，通常包含add、remove、getchild等                                   
        >装饰器模式
            动态的给对象增加一些职责，即增加其额外的功能。
            优点：
                ·采用装饰模式扩展功能比采用继承方式更灵活
                ·可设计多个不同的具体装饰类，创造出多个不同行为的组合
            缺点：
                该模式增加了许多子类，过度使用系统复杂程度加大
            结构：
                <通常扩展一个类的功能使用继承，但继承具有静态特征，耦合度高，随着扩展程度增加，子类会非常膨胀。若使用组合关系创建一个包装（装饰）对象来包裹真是对象，实现在保持真是对象类结构不变的前提下，为其增加额外的功能>
                1 抽象构件角色：定义一个抽象接口，以规范准备接收附加责任的对象
                2 具体构件角色：实现抽象构件，通过装饰角色为其添加职责
                3 抽象装饰角色：继承抽象构件，并包含具体构件的实现，可通过其子类扩展具体构件的功能
                4 具体装饰角色：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任
            应用场景：
                ·需要给一个现有类添加附加职责，而不能采用生成子类的方法进行扩充时。例如，该类被隐藏或者该类是终极类或者采用继承方式会产生大量的子类。
                ·当需要通过对现有的一组基本功能进行排列组合产生非常多的功能时，采用继承关系很难实现
                ·当对象的功能要求可以动态的添加，也可以再动态地撤销时
                ->装饰模式最著名的应用，Java的I/O标准库的设计。
            扩展：
                装饰模式的4个母鹅色不是任何时候都要存在，以下情况可简化：
                    ·如果只有一个具体构件而没有抽象构件时，可让抽象装饰继承具体构件。
                    ·如果只有一个具体装饰时，可以将抽象装饰和具体装饰合并。
        >外观模式 Facade|“迪米特法则”的典型应用
            为多个复杂的自系统提供一个一致的接口，使这些子系统更加容易被访问，该模式对外有一个统一接口，外部程序不用关心内部子程序具体实现
            定义：
            优点：
                降低了子系统与客户端之间的耦合度，使得子系统的变化不会影响调用它的客户类
                对客户屏蔽了子系统组件，减少了客户处理的对象数目，并使得子系统使用起来更加容易
                降低了大型软件系统中的编译依赖性，简化了系统在不同平台之间的移植过程，因为编译一个子系统不会影响其他的子系统，也不会影响外观对象。
            缺点：
                不能很好地限制客户使用子系统类
                增加新的子系统可能需要修改外观类或客户端的源代码，违背了“开闭原则”
            结构：
                1 外观角色 Facade：为多个子系统对外提供一个共同的接口
                2 子系统角色 subsystem：实现系统的部分功能，客户可以通过外观角色访问它
                3 客户角色 client：通过一个外观角色访问各自子系统的功能
            场景：
                ·对分层结构系统构建时，使用外观模式定义子系统中每层的入口点可以简化子系统之间的依赖关系
                ·当一个复杂系统的子系统很多时，外观模式可以为系统设计一个简单的接口供外界访问
                ·当客户端与多个子系统之间存在很大的联系时，引入外观模式可将它们分离，从而提高子系统的独立性和可移植性
        >享元模式
            运用共享技术来有效的支持大量细粒度对象的复用
        >代理模式
            对某对象提供一种代理以控制对该对象的访问。即客户端通过代理间接地访问该对象，从而限制、增强或修改该对象的一些特性
            定义：
                由于某些原因需要给某对象提供一个代理以控制对该对象的访问。访问对象不适合或者不能直接引用目标对象，代理对象作为访问对象和目标对象之间的中介。
            优点：
                ·代理模式在客户端与目标对象之间祈祷一个中介作用和保护目标对象的作用
                ·代理对象可以扩展目标对象的功能
                ·代理模式能见客户端与目标对象分离，在一定程度上降低系统耦合度
            缺点：
                ·在客户端和目标对象之间增加一个代理对象，会造成请求处理速度变慢
                ·增加系统复杂度
            结构：
                1-抽象主题 subject类：通过接口或抽象类声明真实主题和代理对象实现的业务方法
                2-真实主题 Real Subject类：实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象
                3-代理 Proxy类：提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或者扩展真实主题的功能。
            实现：
                package proxy；
                public class ProxyTest{
                    public static void main(String[] args){
                        Proxy proxy = new Proxy();
                        proxy.Request();
                    }
                }
                //抽象主题
                interface Subject{
                    void Request();
                }
                //真实主题
                class RealSubject implements Subject{
                    public void Request(){
                        System.out.println("访问真实主题方法...);
                    }
                }
                //代理
                class Proxy implements Subject{
                    private RealSubject realSubject;
                    public void Request(){
                        if(realSubject==null){
                            realSubject=new RealSubject();
                        }
                        preRequest();
                        realSubject.Request();
                        postRequest();
                    }
                    public void preRequest(){
                        System.out.println("访问真实主题之前的预处理);
                    }
                    public void postRequest(){
                        System.out.println("访问真实主题之后的后续处理");
                    }
                }
            使用场景：
                ·远程代理，通常为隐藏目标对象存在于不同地址空间的事实，方便客户端访问。
                ·虚拟代理，通常用于要创建的目标对象开销很大时。
                ·安全代理，通常用于控制不同种类客户对真实对象的访问权限
                ·智能代理，主要用于调用目标对象时，代理附加一些额外的处理功能。
                ·延迟加载，指为提高系统的性能，延迟对目标的加载。
            代理模式的扩展：
                代理类中包含了对真实主题的引用，这种方式存在问题：
                    1，真实主题与代理主题一一对应，增加真实主题也要增加代理
                    2，设计代理以前真实主题必须事先存在，不太灵活。采用动态代理模式可以解决以上问题，如springAOP     
·行为模式：
    关注对象之间的通信：
	>责任链模式
	    使用场景：责任链模式也叫职责链模式/
	        ·有多个对象可以处理一个请求，哪个对象处理该请求由运行时刻自动确定
	        ·可动态指定一组对象处理请求，或添加新的处理者
	        ·在不明确指定请求处理者的情况下，向多个处理者中的一个提交请求
	    定义：为了避免请求发送者与多个请求处理者耦合在一起，将所有请求的处理者通过前一对象记住其下一个对象的引用而连成一条链；当有请求发生时，可将请求沿着这条链传递，直到有对象处理它为止。
	    优点：
	        ·降低了对象之间的耦合度
	        ·增强了系统的可扩展性
	        ·增强了给对象指派职责的灵活性
	        ·责任链简化了对象之间的连接
	        ·责任分担
	    缺点：
	        ·不能保证每个请求一定被处理
	        ·对比较长的职责链，请求的处理可能涉及多个处理对象，系统性能将受到一定影响
	        ·职责链建立的合理性要靠客户端来保证，增加了客户端的复杂性，可能会由于职责链的错误设置而导致系统出错，如可能会造成循环调用
	    结构：
	        1 抽象处理者 handler：处理请求的接口，包含抽象处理方法和一个后续链接
	        2 具体处理者 concrete handler：实现抽象处理者的处理方法，判断能否处理本次请求，如果可以请求则处理，否则将该请求转给他的后继者
	        3 客户类 client：创建处理链，并向链头的具体处理者对象提交请求，不关心处理细节和请求的传递过程
	    扩展：
	        ·纯的职责链模式：一个请求必须被某一个处理者对象所接收，且一个具体处理者对某个请求的处理只能采用以下两种行为之一：自己处理（承担责任）；把责任推给下家处理。
	        ·不纯的职责链模式：允许出现某一个具体处理者对象在承担了请求的一部分责任后又将剩余的责任传给下家的情况，且一个请求可以最终不被任何接收端对象所接收。
	>命令模式
	    使用场景：
	        ·将方法的请求者与方法的实现者进行解藕。
	        ·系统需要将请求调用者和请求接收者解藕，命令模式使调用者和接受者不直接交互
	        ·系统需要随机请求命令或经常增加或删除命令时，命令模式比较合适
	        ·系统需要执行一组操作时，命令模式可以定义宏命令实现该功能
	        ·使用undo和redo时，可以将命令对象存储起来，采用备忘录模式来实现
	    定义：将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分开，两者之间通过命令对象进行沟通，方便了将命令对象进行存储、传递、调用、增加与管理。
	    优点：
	        ·降低系统耦合度
	        ·管理命令方便，满足开闭原则，扩展灵活
	        ·可实现宏命令。可以与组合模式结合形成宏命令
	        ·方便undo和redo
	    缺点：
	        产生大量具体命令类
	    结构：
	        1 抽象命令类角色 Command：声明执行命令的接口，拥有执行命令的抽象方法execute()
	        2 具体命令角色角色 Concrete Command：抽象命令类的具体实现类，拥有接受者对象，并通过调用接受者的功能来完成命令要执行的操作
	        3 实现者/接受者角色 Receiver:执行命令功能的相关操作，是具体命令对象的业务真正实现者
	        4 调用者/请求者角色 Invoker：请求的发送者，通常拥有很多命令对象，并通过访问命令对象来自执行相关的请求，不直接访问接受者
	    扩展：
	        命令模式+组合模式=宏命令模式/组合命令模式「宏命令包含了一组命令，充当具体命令与调用者的双重角色，执行时将递归调用其包含的所有命令」
	>解释器模式
	>迭代器模式
	>中介者模式
	>备忘录模式
	>观察者模式
	    场景：
	        · 对象间存在一对多关系，一个对象的状态发生改变会影响其他对象。
	        · 当一个抽象模型有两个方面，其中一个方面依赖于另一方面时，可将这二者封装在独立的对象中以使它们可以各自独立地改变和复用
	    定义：
	        指多个对象间存在一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。这种模式有时又称作发布-订阅模式、模型-视图模式，它是对象行为型模式
	    优点：
	        · 降低了目标与观察者之间的耦合关系，两者之间是抽象耦合关系
            · 目标与观察者之间建立了一套触发机制
	    缺点：
	        · 目标与观察者之间的依赖关系并没有完全解除，而且有可能出现循环引用
	        · 当观察者对象很多时，通知的发布会花费很多时间，影响程序的效率
	    结构：
	        1 抽象主题（Subject）角色：也叫抽象目标类，它提供了一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，以及通知所有观察者的抽象方法。
	        2 具体主题（Concrete    Subject）角色：也叫具体目标类，它实现抽象目标中的通知方法，当具体主题的内部状态发生改变时，通知所有注册过的观察者对象
	        3 抽象观察者（Observer）角色：它是一个抽象类或接口，它包含了一个更新自己的抽象方法，当接到具体主题的更改通知时被调用。
	        4 具体观察者（Concrete Observer）角色：实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态。
	    扩展：
	        
	>状态模式
	>空对象模式
	>策略模式
	    使用场景：
	        某种目标存在多种策略可以选择，实现某一种功能存在多种算法或策略，根据环境或条件的不同选择不同算法或策略完成。类似排序策略的选择：冒泡、选择排序、插入排序、二叉树排序等。
	        使用if-else if-else体系维护复杂，涉及源代码update，违背开闭原则，用策略模式可避免该问题。
	        ·一个系统需动态地在几种算法中选择一种时，可将每个算法封装到策略类
	        ·一个类定义多种行为，该些行为在该类中以多个条件语句的形式出现，可将每个条件分支移入各自的策略类，替代这些语句
	        ·系统中各算法完全独立，且要求对客户隐藏具体算法细节
	        ·要求系统用户使用时不可见其操作数据，可用该模式隐藏与算法相关的数据结构
	        ·多个类只区别在表现行为不同，可使用策略模式，在运行时动态选择具体要执行的行为
	    定义：
	        定义一系列算法，并将其各个封装，使它们可相互替换，算法的变化不影响用户。属于对象行为模式，把使用算法的责任和算法的实现分割，并委派给不同的对象对这些算法进行管理。
	    优点：
	        ·提供可重用的算法簇，通过继承可把公共代码给弗雷，避免重复无用代码
	        ·提供相同的行为不同的实现
	        ·不修改代码可灵活增加新算法
	        ·算法的使用放到环境类，算法的实现移到具体策略类，实现二者分离
	    缺点：
	        ·客户端必须理解所有策略算法区别，以科学选择
	        ·造成大量策略类
	    结构：
	        1 抽象策略类 Strategy：定义一个公共接口，各种不同算法以不同方式实现该接口，环境角色使用该借口调用不同算法，一般使用接口或抽象类实现
	        2 具体策略类 Concrete Strategy：实现抽象策略类定义的接口，提供具体的算法实现
	        3 环境类 Context： 持有一个策略类的引用，最终给客户端调用
	    扩展：
	        当策略很多时，客户端管理所有策略算法会复杂，在环境类中使用策略工厂模式管理这些策略类将大大减少客户端的工作复杂度
	>模版模式
	    场景：
	        //简历模板、论文模板、Word 中模板文件等
	        1 算法的整体步骤固定，其中个别部分易变。将该部分抽象，供子类实现
	        2 多个子类中存在共同代码，提取其放至公共父类中避免代码重复。
	        3 当需要控制子类的扩展时，模版方法只在特定点调用钩子操作，即这样只允许在这些店进行扩展
	    定义：
	        ·定义一个算法的骨架，将算法的一些步骤延迟到子类中，使子类不用修改算法结构的情况下重新定义算法的某些特定步骤，属于行为模式
	    优点：
	        ·封装了不变部分，扩展可变部分。
	        ·在父类中提取了公共的部分代码，便于代码复用
	        ·部分方法是由子类实现的，因此子类可以通过扩展方式增加相应的功能，符合开闭原则
	    缺点：
	        ·对每个不同的实现都需要定义一个子类，这会导致类的个数增加，系统更加庞大，设计也更加抽象。
	        ·父类中的抽象方法由子类实现，子类执行的结果会影响父类的结果，这导致一种反向的控制结构，它提高了代码阅读的难度
	    结构：
	        1 抽象类 abstract class：负责给出一个算法的轮廓和骨架，由一个模版方法和若干个基本方法构成：
	            ·模版方法：算法的骨架定义，按某种顺序调用其包含的基本方法
	            ·基本方法：整个算法的一个步骤，包含：
	                > 抽象方法：在抽象类中申明，由具体子类实现
	                > 具体方法：在抽象类中已经实现，在具体子类中可以继承或重写它
	                > 钩子方法：在抽象类中已经实现，包括用于判断的逻辑方法和需要子类重写的空方法两种
	        2 具体子类 concrete class：实现抽象类中所定义的抽象方法和钩子方法，是一个顶级逻辑的一个组成步骤。      
	    扩展：
	        可通过在具体子类中重写钩子方法，来改变抽象父类中的运行结果。
	>访问者模式
·j2ee模式：
    关注表示层，由sun java center鉴定
        >mvc模式
	>业务代表模式
	>组合实体模式
	>数据访问对象模式
	>前端控制器模式
	>拦截过滤器模式
	>服务定位器模式
	>传输对象模式


设计模式六大原则：
1.开闭原则 open close principle
    对扩展开放，对修改关闭。在程序需要进行扩展时，不能去修改原有代码，实现一个热插拔效果。为了程序的扩展性好，易于维护和升级。需要使用接口和抽象类。

2.里式代换原则 liskov substitution principle
    任何基类可以出现的地方，子类一定也可以出现。只有当派生类可以替换掉基类，且软件单位的功能不受影响时，基类才能真正被复用，而派生类也能够在基类的基础上增加新的行为。里式代换原则是对开闭原则的补充。实现开闭原则的关键是抽象化，而基类于子类的继承关系就是抽象化的具体实现，所以利是代换原则是对实现抽象化的具体步骤的规范。

3.依赖倒转原则 dependence inversion principle
    开闭原则的基础，具体内容：针对接口编程，依赖于抽象而不依赖于具体。

4.接口隔离原则 interface segregation principle
    使用多个隔离的接口，比使用单个接口要好。降低类之间的耦合。

5.迪米特法则，最少知道原则 demeter principle
    一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相互独立。

6.合成复用原则 composite reuse principle
    尽量使用合成/聚合的方式，而不是使用继承。
