# 算法学习

    Record :
    
    * 默认所有排序都是从小到大
    
    2019.11.28 新增[传送门]，从希尔排序开始使用[传送门]，用于相关引用/学习的外部博客地址

- ### 排序
| 种类 | 时间复杂度（平均） |方法 | 完成度 |
| ---- | ---- | ---- | ---- | 
| 冒泡排序 | O(n<sup>2</sup>) | sort.Bubble | √ |
| 选择排序 | O(n<sup>2</sup>) | sort.Select | √ |
| 直接插入排序 | O(n<sup>2</sup>) | sort.DirectInsert | √ |
| 折半查找排序 | O(n<sup>2</sup>) | sort.HalfSearchInsert | √ |
| 希尔排序 | O(n<sup>2</sup>) | sort.Shell | √ |
| 归并排序 | O(nlogn) | sort.Merge | √ |
| 快速排序 | O(n) | sort.Quick | √ |
| 堆排序   | | | × |
| 桶排序   | | | × |
| 基数排序 | | | × |
| 计数排序 | | | × |


- #### 冒泡排序
1. 比较相邻的元素。如果第一个比第二个大,就交换他们两个
2. 对每一对相邻元素做同样的工作,从开始第一对到结尾的最后一对
3. 在这一点,最后的元素应该会是最大的数
4. 针对所有的元素重复以上的步骤,除了最后一个
5. 持续每次对越来越少的元素重复上面的步骤,直到没有任何一对数字需要比较

- #### 选择排序
1. 每一轮排序找出最小的值与当前的值做交换
2. 下一轮的查找最小值起始下标+1,已交换的值已经是排序完毕

- #### 直接插入排序
1. 循环从下标1开始，作为待插入数
2. 比较待插入数的前一个数是否比待插入数大
3. 如果待插入数的前一个数大于待插入数，则循环比较待插入数之前的所有数列
5. 比较循环体的每一个数将后移一位，直到找到，比前一个数大的位置下标
4. 交换待插入值与插入下标的值

- #### 折半查找排序
1. 定义当前循环当前下标位置为待排序数
2. 待排序数之前的为有序数列
3. 待排序数之和的为未排序数列
4. 在有序数列，内循环找到mid下标，如果mid值大于待排序值则right=mid-1，否则left=mid+1
5. 内循环直到找到准确的left下标，即可插入的下标，left>right时，则代表已找到
6. left下标之后所有的值后移一位
7。 将当前待排序数插入left下标处

- #### 希尔排序 [传送门](https://www.cnblogs.com/chengxiao/p/6104371.html)
1. 希尔排序主要是在直接插入排序的升级
2. 核心是将原有的待排序数组，以gap为维度分为N组，初始gap为len/2，gap的设定与排序效率有关，len/2是默认值，根据实际情况设定len/x
3. 设置为多个逻辑组是为了凸显直接插入排序在部分有序数列时可以发挥出更优的排序效率

- #### 归并排序 [传送门](https://www.itcodemonkey.com/article/3288.html)
1. 归并排序主要是分治法，分而治之，
2. 存在被分的逻辑数组，以及辅助排序的逻辑数组
3. 每次递归都将arr拆分为以/2的形式拆分为跟小的逻辑数组
4. 被分的逻辑素组只有一个元素的时候，则不治而治
5. 通过辅助排序的逻辑数组进行对每个分组的逻辑数组合并排序
6. 最后将逻辑数组元素重新复制给主数组

- #### 快速排序 [传送门](https://www.sczyh30.com/posts/Algorithm/algorithm-quicksort/)
1. 快排的本质也是运用分治法
2. 以一个基准点为后面的比较当前数列进行比较，大于基准点是值移动到右边，小于基准点的值为左边
3. 运用分治法，一轮结束后，以上一轮的基准点为切分点，分为左右两个数列，继续递归比较
4. 直到每一个数列递归数列都符合小于基准点的在左，大于的在右边，递归结束则完成排序

- #### 堆排序 [传送门](https://www.cnblogs.com/lanhaicode/p/10546257.html)