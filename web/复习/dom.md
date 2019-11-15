#### 元素节点关系
* 在节点树中，顶端节点被称为根（root）
* 父节点——每个节点都有父节点，除非该元素是文档的根结点
* 子节点——每个元素节点可以有0个、1个或多个子节点
* 同胞节点——指拥有相同父节点的节点

#### 访问DOM节点
##### 直接获取节点
* 通过id属性获得节点————document.getElementById();
* 通过标签名获得所有同名标————documnet.getElementsByTagName();
* 通过类名获得所有类名相同的标签————document.getElementsByClassName();
##### 通过节点关系获取
* 通过父节点获取子节点
* 通过子节点获得父节点
* 获得前后兄弟节点

#### 节点树&元素树
|                                |节点树|元素树（没有文本注释）|
|:--------------------:|:----------------:|:--------------------:|
|获取父节点|parentNode|parentElement|
|获取子节点|childNodes|children|
|获取第一个子节点|firstChild|firstElementChild|
|获取最后一个子节点|lastChild|lastElementChild|
|获取前一个兄弟节点|previousSibling|previousElementSibling|
|获取后一个兄弟节点|nextSibling|nextElementSibling|

#### 元素节点内容
#####  innnerHTML属性
* innerHTML是DOM中元素节点的属性，相当于一个容器
* 用于获取或改变任意元素节点的内容，该属性可读可写
* 操作简单，几乎所有浏览器军支持

##### 获取某一元素节点的属性——node.getAttribute(attrName);
##### 设置某一元素节点的属性——node.getAttribute(attrName,value);
* 当属性存在是，为修改相应的属性值
* 当属性不存在是，为添加相应的属性
##### 删除某一元素节点的属性——node.removeAttribute(attrName);
##### 判断某一节点是否含有某属性——node.hasAttribute(attrName);-------返回值为布尔值true/false

#### 删除表格
            <h3>删除表格</h3>
        <table border="2" id="table1">
            <tr>
                <th><button>删除本行1</button></th>
                <th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
                <th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
                <th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
            </tr>
            <tr>
                    <th><button>删除本行2</button></th>
                    <th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
                    <th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
                    <th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
            </tr>
            <tr>
                    <th><button>删除本行3</button></th>
                    <th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
                    <th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
                    <th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
            </tr>
            <tr>
                    <th><button>删除本行4</button></th>
                    <th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
                    <th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
                    <th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
            </tr>
        </table>

            var table1=document.getElementById("table1");
            var btnList=document.getElementsByTagName("button");
                for(var i=0;i<btnList.length;i++){
                    btnList[i].onclick=function (){
                        var tarNode=this.parentElement.parentElement;
                        table1.children[0].removeChild(tarNode);
                    }
                }

#### DOM操作小结