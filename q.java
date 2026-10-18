package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:q.class */
public final class q {
    public static final int a(int r2) {
        return r2 < 0 ? -r2 : r2;
    }

    public static final int a(int r3, int r4) {
        int r0 = r3 % r4;
        return r0 < 0 ? r0 + r4 : r0;
    }

    public static final int b(int r3, int r4) {
        return r3 < r4 ? r3 : r4;
    }

    public static final int c(int r3, int r4) {
        return r3 > r4 ? r3 : r4;
    }

    public static final int d(int r3, int r4) {
        if (r3 < 0) {
            return 0;
        }
        return r3 > r4 ? r4 : r3;
    }

    public static final int e(int r3, int r4) {
        if (r3 < 0) {
            return 0;
        }
        return r3 > r4 ? r4 : r3;
    }

    public static int b(int r5) {
        int r6;
        if (r5 <= 0) {
            return 0;
        }
        int r7 = (r5 + 1) >> 1;
        if (r5 >= 92679) {
            do {
                int r0 = r7;
                r6 = r0;
                r7 = (int) (((((long) r0) * ((long) r6)) + ((long) r5)) / ((long) (r6 << 1)));
                if (r6 == r7) {
                    break;
                }
            } while (r6 + 1 != r7);
        } else {
            do {
                int r1 = r7;
                r6 = r1;
                r7 = ((r1 * r1) + r5) / (r6 << 1);
                if (r6 == r7) {
                    break;
                }
            } while (r6 + 1 != r7);
        }
        return r6;
    }

    public static int f(int r4, int r5) {
        return (r4 * r4) + (r5 * r5);
    }

    static {
        int[] r0 = {0, 1, 0, -1};
    }
}
