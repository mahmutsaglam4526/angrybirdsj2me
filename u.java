package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:u.class */
public final class u {
    public int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int[] f428a;

    public u(int r5) {
        this.f428a = new int[((r5 - 1) >> 5) + 1];
        this.a = r5;
    }

    public final void a() {
        int r0 = ((this.a - 1) >> 5) + 1;
        for (int r6 = 0; r6 < r0; r6++) {
            this.f428a[r6] = 0;
        }
    }

    public final void a(int r6) {
        int r0 = r6 >> 5;
        int[] r1 = this.f428a;
        r1[r0] = r1[r0] | (1 << (r6 & 31));
    }

    public final void b(int r7) {
        int r0 = r7 >> 5;
        int[] r1 = this.f428a;
        r1[r0] = r1[r0] & ((1 << (r7 & 31)) ^ (-1));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m195a(int r5) {
        return (this.f428a[r5 >> 5] >> (r5 & 31)) & 1;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m196a(int r5) {
        return ((this.f428a[r5 >> 5] >> (r5 & 31)) & 1) != 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m197a() {
        int r1;
        int r0 = ((this.a - 1) >> 5) + 1;
        for (int r6 = 0; r6 < r0; r6++) {
            if (this.f428a[r6] != 0) {
                int r2 = r6 << 5;
                int r5 = this.f428a[r6];
                int r7 = 0;
                while (r5 != 0) {
                    if ((r5 & 1) != 0) {
                        r1 = r7;
                        return r2 | r1;
                    }
                    r5 >>>= 1;
                    r7++;
                }
                r1 = -1;
                return r2 | r1;
            }
        }
        return -1;
    }

    public final String toString() {
        int r0 = this.a;
        int r7 = r0;
        char[] cArr = new char[r0];
        while (true) {
            int r1 = r7;
            r7--;
            if (r1 <= 0) {
                return new String(cArr);
            }
            cArr[r7] = (char) (48 + m195a(r7));
        }
    }
}
