package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:dl.class */
public final class dl extends bt implements dj {
    private int d;
    private int e;
    private int f;
    private static final int[][] a = {new int[]{257, 258, 259, 255, 256, 252, 253, 254, 260}, new int[]{266, 267, 268, 264, 265, 261, 262, 263, 269}, new int[]{275, 276, 277, 273, 274, 270, 271, 272, 278}};
    private static final int[] c = {10415086, 7916129, 9877998};

    public dl() {
        int r0 = de.a(0);
        for (int r8 = r0; r8 < r0 + dj.a[0]; r8++) {
            if (cd.a(r8)) {
                this.f++;
                this.d += cd.m99a(r8);
                this.e += cd.b(r8);
            }
        }
        ((bt) this).c = 200;
        a(au.m43a(a[0][0]) + au.m43a(a[0][2]) + (au.m43a(a[0][1]) * 12), au.m44b(a[0][0]) + au.m44b(a[0][5]) + (au.m44b(a[0][3]) * 9));
    }

    @Override // defpackage.bo
    /* JADX INFO: renamed from: b */
    public final void mo89b() {
    }

    @Override // defpackage.bo
    public final void b(int r8, int r9) {
        int r0 = r8 + ((bo) this).b[0];
        int r1 = r9 + ((bo) this).b[1];
        int r2 = (m90a(0) - au.m43a(a[0][0])) - au.m43a(a[0][2]);
        int r3 = (m90a(1) - au.m44b(a[0][0])) - au.m44b(a[0][5]);
        int r4 = r0 + au.m43a(a[0][0]);
        int r5 = r1 + au.m44b(a[0][0]);
        int r6 = m90a(0) - 28;
        au.d(c[0]);
        au.a(r4, r5, r2, r3);
        au.d(16777215);
        int r15 = r0 + au.m43a(a[0][0]);
        for (int r16 = 0; r16 < 12; r16++) {
            au.a(a[0][1], r15, r1);
            au.a(a[0][6], r15, r5 + r3);
            r15 += au.m43a(a[0][1]);
        }
        int r17 = r5;
        for (int r11 = 0; r11 < 9; r11++) {
            au.a(a[0][3], r0, r17);
            au.a(a[0][4], r4 + r2, r17);
            r17 += au.m44b(a[0][3]);
        }
        au.a(a[0][0], r0, r1);
        au.a(a[0][2], (r0 + m90a(0)) - au.m43a(a[0][2]), r1);
        au.a(a[0][5], r0, (r1 + m90a(1)) - au.m44b(a[0][5]));
        au.a(a[0][7], (r0 + m90a(0)) - au.m43a(a[0][2]), (r1 + m90a(1)) - au.m44b(a[0][7]));
        au.a(a[0][8], (r0 + ((int) (m90a(0) / 2.0f))) - (au.m43a(a[0][8]) / 2), (r1 + ((int) (m90a(0) / 4.0f))) - (au.m44b(a[0][8]) / 2));
        String string = new StringBuffer().append("").append(this.d).append("/").append(dj.a[0] * 3).toString();
        int r7 = au.a(2, string) + au.m43a(282);
        int r10 = r0 + 14 + (r6 >> 2);
        int r12 = r1 + (m90a(1) >> 1) + (au.m46c(2) / 2) + 3;
        a(r10, r12, r6 >> 1);
        au.a(282, r10 - (r7 >> 1), r12 - 8);
        au.m47a(2, string, (r10 - (r7 >> 1)) + 17, r12 - (au.m46c(2) / 2));
        String string2 = new StringBuffer().append("").append(this.f).append("/").append(dj.a[0]).toString();
        int r13 = au.a(2, string2);
        int r14 = r0 + 14 + ((r6 >> 2) * 3);
        a(r14, r12, r6 >> 1);
        au.m47a(2, string2, r14 - (r13 >> 1), r12 - (au.m46c(2) / 2));
        String string3 = new StringBuffer().append("").append(this.e).toString();
        int r18 = au.a(2, string3);
        int r19 = r0 + 14 + (r6 >> 1);
        int r20 = r1 + ((int) ((m90a(1) >> 2) * 2.8f)) + (au.m46c(2) / 2) + 3;
        a(r19, r20, r6);
        au.m47a(2, string3, r19 - (r18 >> 1), r20 - (au.m46c(2) / 2));
    }

    private static void a(int r5, int r6, int r7) {
        int r0 = q.c(34, q.c(34, 34));
        int r1 = r5 - (r7 >> 1);
        int r2 = r6 - (r0 >> 1);
        int r3 = (r7 - 12) - 12;
        int r4 = r1 + 12;
        au.b(r4, r2, r3, r0);
        for (int r8 = 0; r8 < r3; r8 += 12) {
            au.a(279, r4 + r8, r2);
        }
        au.b(0, 0, ac.a, ac.b);
        au.a(280, r1, r2);
        au.a(281, r4 + r3, r2);
    }
}
