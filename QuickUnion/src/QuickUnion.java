public class QuickUnion {
    int[] id;

    public QuickUnion(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public void union(int p, int q) {
        p = root(p);
        q = root(q);
        id[p] = q;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int current) {
        while (current != id[current]) current = id[current];
        return current;
    }
}

/*
4
3
3
8
6
5
9
4
2
1
5
0
7
2

*/
