package com.maodot.mode.componentmode;

/**
 *组合模式
 * 1、组合模式描述了如何将容器和叶子节点进行递归组合, 使用户在使用时可一致的对待容器和叶子, 为处理树形结构提供了完美的解决方案.
 * 2、当容器对象的指定方法被调用时, 将遍历整个树形结构, 并执行调用. 整个过程递归处理.
 * @author maoodt
 */
public class Client {

    public static void main(String[] args) {
        ImageFileLeaf image = new ImageFileLeaf("九寨沟.jpg");
        VideoFileLeaf video = new VideoFileLeaf("龙门飞甲.rmvb");
        TextFileLeaf text = new TextFileLeaf("解忧杂货店.txt");

        FolderFileComposite home = new FolderFileComposite("/home");
        home.add(image);
        home.add(video);
        home.add(text);

        FolderFileComposite root = new FolderFileComposite("/");
        root.add(home);
        root.add(new TextFileLeaf("/authorized_keys"));
        root.add(new FolderFileComposite("/etc"));

        root.killVirus(1);
    }

    /*
        小结：
        1、组合模式定义了基本对象和组合对象的类层次结构, 基本对象可以被组合成更复杂的组合对象, 而这个组合对象又可以被组合, 这样不断地递归下去, 这样在客户代码中任何用到基本对象的地方都可以使用组合对象.
        2、用户不用关心到底是处理一个叶节点还是处理一个枝节点, 也用不着为定义组合而写一些选择判断语句
        场景：
        当需求中是体现部分与整体层次的结构时, 以及希望用户可以忽略组合对象与单个对象的不同, 统一地使用组合中的所有对象时, 就应该考虑使用组合模式了:
            操作系统资源管理器
            GUI容器视图
            XML文件解析
            OA系统中组织机构处理
            Junit单元测试框架
            TestCase(叶子)、TestUnite(容器)、Test接口(抽象)
    */
}
