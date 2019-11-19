1、Object
wait(), notify(), notifyAll(), wait(timeout)
hashCode(), equals()
clone()
2、String

char[] value
int hash
equals(), startWith(), endWith(), replace
3、AbstractStringBuilder

char[] value
int count
扩容：翻倍，不够取所需最小
4、StringBuffer

继承AbstractStringBuilder
synchronized方法保证线程安全
char[] toStringCache
5、StringBuilder 继承AbstractStringBuilder

6、ArrayList

Object[] elementData
int size
默认大小10
扩容：1.5倍，不够取所需最小
7、LinkedList

Node {E item, Node prev, Node next}
int size
Node first
Node last
linkFirst(), linkLast(), linkBefore(), unLinkFirst(), unLinkLast(), unLink(), indexOf()
8、HashMap

Node{int hash, K key, V value, Node next}
默认容量16，负载因子0.75f
int size, modCount, threshold, float loadFactor
Node[] table
Set entrySet
put():根据key算hash，根据容量和hash算index，table[index]没有直接添加到数组中，table[index]有，若index位置同一个key则更新，否则遍历next是否有，有则更新，无则新增，最后根据thread与size判断是否扩容。注：扩容时容量翻倍，重新算hash复制到新数组
7）get()类似
注：先比较hash，若相等在比较equals
9、Hashtable

结构实现与HashMap基本一致
2)通过synchronized方法保证线程安全
10、HashSet：委托给HashMap，其Value是同一个默认对象

11、LinkedHashMap继承HashMap

Entry{HashMap.Node, Entry before, after}
Entry head, tail
重写newNode()添加节点时，除像HashMap中添加外，保存before、after信息
12、LinkedHashSet继承HashSet：底层存储使用的LinkedHashMap，从而保证有序

13、AbstractMap维护EntrySet，AbstractSet维护Iterator，AbstractList维护Iterator

14、ConcurrentHashMap

JDK1.7及以前：
a、Segment[] ,HashEntry[] , HashEntry{hash, k, v, next}
b、根据key算hash，根据hash和Segment的大小算位置，每个segment拥有一个自己的HashEntry[]
c、get()：不加锁，volatile类型
d、put(): 对相应segment加锁
e、size()：各HashEntry[] 之和，先不加锁算两遍，若一致则返回，若不一致则加锁重新计算
2）JDK1.8
a、Node{hash, key, value, next}
b、Node[] table
c、大多数操作类似于HashMap，不同CAS方式设置，根据key算hash，在根据hash和容量算index，对table[index]加锁，从而达到更大的并发量
d、get(): 同HashMap
e、put(): 对table[index]加锁
15、TreeMap
1）红黑树，即自平衡二叉查找树，时间复杂度O(logn)
2）Entry{K k, V v, Entry parent, left, right, boolean color}
3）Entry root，int size， int modeCount

16、TreeSet：委托TreeMap实现
————————————————
版权声明：本文为CSDN博主「猴子哥哥1024」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/qq_21033663/article/details/79571506