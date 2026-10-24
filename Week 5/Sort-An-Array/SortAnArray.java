public class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        // Построение кучи (перегруппировка массива)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        // Извлечение элементов из кучи по одному
        for (int i = n - 1; i > 0; i--) {
            // Перемещаем текущий корень в конец
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;

            // Вызываем heapify на уменьшенной куче
            heapify(nums, i, 0);
        }

        return nums;
    }

    private void heapify(int[] nums, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Если левый дочерний элемент больше корня
        if (left < n && nums[left] > nums[largest]) {
            largest = left;
        }

        // Если правый дочерний элемент больше, чем самый большой на данный момент
        if (right < n && nums[right] > nums[largest]) {
            largest = right;
        }

        // Если самый большой элемент не корень
        if (largest != i) {
            int swap = nums[i];
            nums[i] = nums[largest];
            nums[largest] = swap;

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(nums, n, largest);
        }
    }
}
