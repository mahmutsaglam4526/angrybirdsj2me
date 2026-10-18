package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ab.class */
public final class ab implements bq {
    private int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private bo f4a;

    public ab() {
    }

    public static void a(int[] r4, int r5) {
        int length = r4.length;
        while (true) {
            length--;
            if (length < 0) {
                return;
            } else {
                r4[length] = r5;
            }
        }
    }

    public static void a(int[] r4, int r5, int r6, int r7) {
        int r0 = r5 + r6;
        while (r5 < r0) {
            int r1 = r5;
            r5++;
            r4[r1] = r7;
        }
    }

    public static int a(int[] r4, int r5, int r6) {
        int r0 = 0;
        while (true) {
            int r7 = r0;
            if (r5 >= r6) {
                return r7;
            }
            int r2 = r5;
            r5++;
            r0 = r7 + r4[r2];
        }
    }

    public static int a(int r3, int[] r4, int r5) {
        int r6 = -1;
        int r7 = r5;
        while (r7 - r6 > 1) {
            int r0 = (r7 + r6) / 2;
            if (r4[r0] < r3) {
                r6 = r0;
            } else {
                r7 = r0;
            }
        }
        if (r7 == r5) {
            return r5 ^ (-1);
        }
        return r4[r7] == r3 ? r7 : r7 ^ (-1);
    }

    public static int a(String str, Object[] objArr, int r5) {
        int r6 = -1;
        int r7 = r5;
        while (r7 - r6 > 1) {
            int r0 = (r7 + r6) / 2;
            if (((String) objArr[r0]).compareTo(str) < 0) {
                r6 = r0;
            } else {
                r7 = r0;
            }
        }
        if (r7 == r5) {
            return r5 ^ (-1);
        }
        return ((String) objArr[r7]).compareTo(str) == 0 ? r7 : r7 ^ (-1);
    }

    public ab(int r4) {
        this.f4a = null;
        this.a = r4;
    }

    public ab(bo boVar) {
        this.f4a = null;
        this.a = 3112813;
        this.f4a = boVar;
    }

    @Override // defpackage.bq
    public final int a() {
        if (this.f4a != null) {
            return this.f4a.m90a(0);
        }
        return 0;
    }

    @Override // defpackage.bq
    public final int b() {
        if (this.f4a != null) {
            return this.f4a.m90a(1);
        }
        return 0;
    }

    @Override // defpackage.bq
    public final void a(int r6, int r7, int r8, int r9) {
        int r0 = au.d();
        if ((this.a & (-16777216)) == 0) {
            au.d(this.a);
        } else {
            au.e(this.a);
        }
        au.a(r6, r7, r8, r9);
        au.e(r0);
    }
}
