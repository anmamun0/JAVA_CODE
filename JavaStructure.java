public class example
{
    public static void main(String[] args) 
    {
        
        //Java intiger array
        //static
        int [] ar1 = {10,20};
        int[] arr = new int[5];
        arr[0] = 0;
        //Daynamic Array
        ArrayList<Integer> ar2 = new ArrayList<>(); 

        //Java String array
        String[] str = new String[5];
        str[0] = "AN.Mamun";

        // Vector example
        vector<String> vec = new Vector<>();
        vector<String> vec = new Vector<>(100);
        vec.add(10);

        int val = 10;
        if(vec.contains(val))System.out.println("Found");
        else System.out.println("Not Found");

        // Set example
        Set<Integer> set = new HashSet<>();
        set.add(10);
        for(int a:set)System.out.println(a);

        // Stack
        Stack<int> st = new Stack<>();
        st.push(0);
        st.peek();//Top element access 
        st.pop() // pop()

        //Queue
        Queue<String> q = new LinkedList<>();
        q.offer(0); // push();
        q.peek() // access top element
        q.poll(); // pop()

        //Priority_Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //list example
        ArrayList<Integer> lst = new ArrayList<>();

        //Map example
        Map<String , Integer> mp = new HashMap<>();
        mp.put("apple",10);

  }
}