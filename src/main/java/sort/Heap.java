package sort;

public class Heap {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 5, 6, 8, 9, 1, 7, 4};
        Heap.buildHeap(arr, arr.length);
        Common.print(arr);
    }

    public static void buildHeap(int[] arr, int len) {
        for (int i = len; i > 0; i--) {
            buildMaxHeap(arr, i);
            swapHead(arr, i);
        }
    }

    public static void buildMaxHeap(int[] arr, int len) {
        for (int i = len / 2 - 1; i >= 0; i--) {
            // 当前节点
            int currentNode = arr[i];
            // 左子节点
            int leftChildNodeIndex = 2 * i + 1;
            // 右子节点
            int rightChildNodeIndex = 2 * i + 2;
            // 左子节点的左子节点
            int leftChildNodeLeftChildNodeIndex = 2 * leftChildNodeIndex + 1;
            // 左子节点的右子节点
            int leftChildNodeRightChildNodeIndex = 2 * leftChildNodeIndex + 2;
            // 右子节点的左子节点
            int rightChildNodeLeftChildNodeIndex = 2 * rightChildNodeIndex + 1;
            // 右子节点的右子节点
            int rightChildNodeRightChildNodeIndex = 2 * rightChildNodeIndex + 2;

            // 如果存在左子节点，如果存在是否大于当前节点，大于则进行交换
            // 判断左子树是否满足大顶堆，左子树的左子节点是否小于左子树节点，左子树的又子节点是否小于左子树节点，如果不满于大顶堆，则递归调整
            if (leftChildNodeIndex < len && currentNode < arr[leftChildNodeIndex]) {
                swapLeft(arr, i);
                if ((leftChildNodeLeftChildNodeIndex < len && arr[leftChildNodeIndex] < arr[leftChildNodeLeftChildNodeIndex])
                        || (leftChildNodeRightChildNodeIndex < len && arr[leftChildNodeIndex] < arr[leftChildNodeRightChildNodeIndex])) {
                    buildMaxHeap(arr, len);
                }
            }

            // 如果存在右子节点，如果存在是否大于当前节点，大于则进行交换
            // 判断右子树是否满足大顶堆，右子树的左子节点是否小于右子树节点，右子树的右子节点是否小于右子树节点，如果不满于大顶堆，则递归调整
            if (rightChildNodeIndex < len && currentNode < arr[rightChildNodeIndex]) {
                swapRight(arr, i);
                if ((rightChildNodeLeftChildNodeIndex < len && arr[rightChildNodeIndex] < arr[rightChildNodeLeftChildNodeIndex])
                        || (rightChildNodeRightChildNodeIndex < len && arr[rightChildNodeIndex] < arr[rightChildNodeRightChildNodeIndex])) {
                    buildMaxHeap(arr, len);
                }
            }
        }

    }

    private static void swapLeft(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[2 * i + 1];
        arr[2 * i + 1] = temp;
    }

    private static void swapRight(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[2 * i + 2];
        arr[2 * i + 2] = temp;
    }

    private static void swapHead(int[] arr, int len) {
        int temp = arr[0];
        arr[0] = arr[len - 1];
        arr[len - 1] = temp;
    }

}
