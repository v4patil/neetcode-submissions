class LRUCache(private val capacity: Int) {

    class Node(
        val key: Int, 
        var value: Int){
        var prev: Node? = null
        var next: Node? = null
    }

  private val cache = HashMap<Int, Node>()

   private val head = Node(-1, -1)
    private val tail = Node(-1, -1)

    init{
        require(capacity > 0) { "Capacity must be greater than zero" }

        head.next = tail
        tail.prev = head 
    }

    fun get(key: Int): Int {
        val node = cache[key] ?: return -1

        removeNode(node)
        addNode(node)
        return node.value
    }

    fun put(key: Int, value: Int) {
        var existingNode = cache[key]

        if(existingNode != null){
            existingNode.value = value
            removeNode(existingNode)
            addNode(existingNode)
            return
        }

         val newNode = Node(key, value)

         cache[key] = newNode
         addNode(newNode)

         if (cache.size > capacity) {
            val lruNode = tail.prev!!
            removeNode(lruNode)
            cache.remove(lruNode.key)
         }

    }

    private fun removeNode(node: Node){
       val previous = node.prev!!
        val next = node.next!!

        previous.next = next
        next.prev = previous
    }

    private fun addNode(node: Node){
        val firstNode = head.next!!

        firstNode.prev = node
        node.next = firstNode

        head.next = node
        node.prev = head
    }
}
