# 算法学习
- ### 排序
| 种类 | 时间复杂度 |方法 | 完成度 |
| ---- | ---- | ---- | ---- | 
| 冒泡排序 | O(n<sup>2</sup>) | sort.Bubble | √ |
| 选择排序 | O(n<sup>2</sup>) | sort.Select | √ |
| 插入排序 | | | × |
| 希尔排序 | | | × |
| 归并排序 | | | × |
| 快速排序 | | | × |
| 基数排序 | | | × |
| 堆排序   | | | × |
| 计数排序 | | | × |
| 桶排序   | | | × |

- #### 冒泡排序
1. 比较相邻的元素。如果第一个比第二个大,就交换他们两个
2. 对每一对相邻元素做同样的工作,从开始第一对到结尾的最后一对
3. 在这一点,最后的元素应该会是最大的数
4. 针对所有的元素重复以上的步骤,除了最后一个
5. 持续每次对越来越少的元素重复上面的步骤,直到没有任何一对数字需要比较

- #### 选择排序
1. 每一轮排序找出最小的值与当前的值做交换
2. 下一轮的查找最小值起始下标+1,已交换的值已经是排序完毕