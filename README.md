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
        聚合关系 aggregaion关系是关联关系的一种，是强关联关系，是整体和部分之间的关系，是has-a的关系。聚合关系通过成员对象实现，其中成员对象是整体对象的一部分，但是成员对象可以脱离整体对象而独立存在。（例如学校、老师） 聚合关系用空心菱形的实线表示，菱形指向整体。
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

		}
	}
}
    ·模式的扩展
        当需要生成的产品不多且不会增加，一个具体工厂类就可以完成时，可以删除抽象工厂类。此时工厂方法模式将退化到简单工厂模式。
	>抽象工厂模式
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
	            单例模式扩展：有限的多例模式->生成有限个实例并保存在ArrayList中，客户需要时可随机获取
	>建造者模式
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
·结构性模式：
    关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。
        >适配器模式
        >桥接模式
        >过滤器模式
	>组合模式
	>装饰器模式
	>外观模式
	>享元模式
	>代理模式
·行为模式：
    关注对象之间的通信：
	>责任链模式
	>命令模式
	>解释器模式
	>迭代器模式
	>中介者模式
	>备忘录模式
	>观察者模式
	>状态模式
	>空对象模式
	>策略模式
	>模版模式
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
