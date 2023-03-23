package _1_Array

func twoSum(nums []int, target int) []int {
	//map 字典存储
	//空间换时间
	m := make(map[int]int)
	//ranges遍历数组
	for k, v := range nums {
		if idx, ok := m[target-v]; ok {
			return []int{idx, k}
		}
		m[v] = k
	}
	return nil
}

func towSum1(nums []int, target int) []int {
	m := make(map[int]int)
	for i := 0; i < len(nums); i++ {
		another := target - nums[i]
		//map中存在
		if _, ok := m[another]; ok {
			return []int{m[another], i}
		}
		//记录遍历数对应的key值即索引
		m[nums[i]] = i
	}
	return nil
}
