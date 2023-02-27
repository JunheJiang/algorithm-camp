package structures

// intHeap 实现了最小堆 heap 的接口
type intHeap []int

//长度
func (h intHeap) Len() int {
	return len(h)
}

//小于
func (h intHeap) Less(i, j int) bool {
	return h[i] < h[j]
}

//交换元素
func (h intHeap) Swap(i, j int) {
	h[i], h[j] = h[j], h[i]
}

//插入元素
func (h *intHeap) Push(x interface{}) {
	// Push 使用 *h，是因为
	// Push 增加了 h 的长度
	*h = append(*h, x.(int))
}

//弹出元素
func (h *intHeap) Pop() interface{} {
	// Pop 使用 *h ，是因为
	// Pop 减短了 h 的长度
	res := (*h)[len(*h)-1]
	*h = (*h)[:len(*h)-1]
	return res
}
