package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:db.class */
public final class db {
    private static int[] a = {-1, -1, -1, -1};

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int f250a;

    public static void a() {
        for (int r4 = 0; r4 < 4; r4++) {
            if (a[r4] < 0) {
                a[r4] = ay.a();
            }
        }
    }

    public static void b() {
        for (int r4 = 0; r4 < 4; r4++) {
            if (a[r4] >= 0) {
                ay.a(a[r4]);
            }
            a[r4] = -1;
        }
    }

    public static final void a(int r4) {
        if (r4 == 0 || !ce.a) {
            return;
        }
        for (int r5 = 1; r5 < 4; r5++) {
            if (a[r5] >= 0) {
                ay.a(a[r5]);
            }
            a[r5] = -1;
        }
        if (a[0] >= 0) {
            ay.a(a[0], r4);
            ay.b(a[0]);
        }
    }

    public static final void b(int r3) {
        a(r3, false);
    }

    public static final void a(int r3, boolean z) {
        if (r3 == 0 || !ce.a) {
            return;
        }
        for (int r5 = 0; r5 < 4; r5++) {
            if (a[r5] >= 0 && !ay.m64a(a[r5])) {
                ay.a(a[r5], r3);
                ay.b(a[r5]);
                return;
            }
            if (r5 == 3 && z) {
                ay.a(f250a, r3);
                ay.b(f250a);
                int r0 = f250a + 1;
                f250a = r0;
                if (r0 == 4) {
                    f250a = 0;
                }
            }
        }
    }

    public static void c() {
        for (int r3 = 0; r3 < 4; r3++) {
            if (a[r3] >= 0) {
                ay.c(a[r3]);
            }
        }
    }
}
