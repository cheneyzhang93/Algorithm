# 算法学习

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
| 堆排序   | O(nlog2n) | sort.Heap | √ |

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
1. 把数组用树形结构进行逻辑表示
2. 分为左子树、右子树，每三个节点作为子树进行比较
3. 如果存在左子节点，如果存在是否大于当前节点，大于则进行交换
4. 判断左子树是否满足大[小]顶堆，左子树的左子节点是否小于[大于]左子树节点，左子树的又子节点是否小于[大于]左子树节点，如果不满于大[小]顶堆，则递归调整
5. 如果存在右子节点，如果存在是否大于当前节点，大于则进行交换
6. 判断右子树是否满足大[小]顶堆，右子树的左子节点是否小于[大于]右子树节点，右子树的右子节点是否小于[大于]右子树节点，如果不满于大[小]顶堆，则递归调整
7. 每一轮数组调整完之后，大顶堆的堆顶与堆尾进行替换，则就把大数后移
8. 调整完后再遍历

- ### LeetCode 探索-初级算法 
1. #### [存在重复](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/24/)
2. #### [两个数组的交集 II](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/26/)
3. #### [有效的数独](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/30/)
4. #### [买卖股票的最佳时机 II](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/22/)
5. #### [移动零](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/28/)
6. #### [加一](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/27/)
7. #### [从排序数组中删除重复项](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/21/)
8. #### [整数反转](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/33/)
9. #### [反转字符串](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/32/)
10. #### [旋转数组](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/23/)
11. #### [旋转图像](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/31/)
12. #### [只出现一次的数字](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/25/)
13. #### [字符串中的第一个唯一字符](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/34/)
14. #### [有效的字母异位词](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/35/)
15. #### [验证回文字符串](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/36/) 
16. #### [字符串转换整数 (atoi)](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/37/) 
17. #### [实现 strStr()](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/38/) 
18. #### [外观数列](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/39/)
19. #### [最长公共前缀](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/40/)
20. #### [删除链表中的节点](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/41/)
21. #### [删除链表的倒数第N个节点](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/42/)
22. #### [反转链表](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/43/)
23. #### [合并两个有序链表](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/44/)
24. #### [回文链表](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/45/)
25. #### [环形链表](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/46/)
26. #### [二叉树的最大深度](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/)
27. #### [验证二叉搜索树](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/48/)
28. #### [对称二叉树](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/49/)
29. #### [二叉树的层次遍历](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/50/)
30. #### [将有序数组转换为二叉搜索树](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/7/trees/51/)
31. #### [合并两个有序数组](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/8/sorting-and-searching/52/)
32. #### [第一个错误的版本](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/8/sorting-and-searching/53/)
33. #### [爬楼梯](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/23/dynamic-programming/54/)
34. #### [买卖股票的最佳时机](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/23/dynamic-programming/55/)
35. #### [最大子序和](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/23/dynamic-programming/56/)
36. #### [打家劫舍](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/23/dynamic-programming/57/)
37. #### [Shuffle an Array](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/24/design/58/)
38. #### [最小栈](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/24/design/59/)
39. #### [Fizz Buzz](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/25/math/60/)
40. #### [计数质数](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/25/math/61/)
41. #### [3的幂](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/25/math/62/)
42. #### [罗马数字转整数](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/25/math/63/)
43. #### [位1的个数](https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/26/others/64/)
44. #### [汉明距离](https://leetcode-cn.com/explore/featured/card/top-interview-questions-easy/26/others/65/)
45. #### [颠倒二进制位](https://leetcode-cn.com/explore/featured/card/top-interview-questions-easy/26/others/66/)
46. #### [帕斯卡三角形](https://leetcode-cn.com/explore/featured/card/top-interview-questions-easy/26/others/67/)
47. #### [有效的括号](https://leetcode-cn.com/explore/featured/card/top-interview-questions-easy/26/others/68/)
48. #### [缺失数字](https://leetcode-cn.com/explore/featured/card/top-interview-questions-easy/26/others/69/)

- ### LeetCode 动态规划
#### 303 [区域和检索 - 数组不可变](https://leetcode-cn.com/problems/range-sum-query-immutable/)
#### 292 [判断子序列](https://leetcode-cn.com/problems/is-subsequence/)
#### 746 [使用最小花费爬楼梯](https://leetcode-cn.com/problems/min-cost-climbing-stairs/)
#### 1025 [除数博弈](https://leetcode-cn.com/problems/divisor-game/)


