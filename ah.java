package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ah.class */
public final class ah {
    public int[][] a;

    public ah() {
    }

    public static boolean a(int[] r5, int r6, int r7, int r8) {
        return r6 >= r5[0] - r8 && r7 >= r5[1] - r8 && r6 < (r5[0] + r5[2]) + r8 && r7 < (r5[1] + r5[3]) + r8;
    }

    public ah(int[] r5, int[] r6, int[] r7, int[] r8) {
        this.a = null;
        this.a = new int[4][];
        this.a[0] = r5;
        this.a[1] = r6;
        this.a[2] = r7;
        this.a[3] = r8;
    }
}
