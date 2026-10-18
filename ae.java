package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ae.class */
public final class ae {
    private static int[][] a = new int[8][4];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int f11a;

    private static void b(int[] r6) {
        au.b(r6[0], r6[1], r6[2], r6[3]);
    }

    public static int[] a() {
        int[][] r0 = a;
        int r1 = f11a;
        f11a = r1 + 1;
        int[] r2 = r0[r1];
        r2[0] = au.f();
        r2[1] = au.g();
        r2[2] = au.h();
        r2[3] = au.i();
        return r2;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m7a() {
        int[][] r0 = a;
        int r1 = f11a - 1;
        f11a = r1;
        b(r0[r1]);
    }

    public static boolean a(int r6, int r7, int r8, int r9) {
        int[] r0 = a();
        int[] r1 = a[f11a];
        az.a(r0, 0, r1, 0, 4);
        int r10 = 0;
        while (r10 < 2) {
            int r12 = r10 == 0 ? r6 : r7;
            int r2 = (r1[r10] + r1[r10 + 2]) - (r12 + (r10 == 0 ? r8 : r9));
            if (r2 > 0) {
                int r3 = r10 + 2;
                r1[r3] = r1[r3] - r2;
            }
            int r4 = r12 - r1[r10];
            if (r4 > 0) {
                int r5 = r10;
                r1[r5] = r1[r5] + r4;
                int r11 = r10 + 2;
                r1[r11] = r1[r11] - r4;
            }
            if (r1[r10 + 2] <= 0) {
                f11a--;
                return false;
            }
            r10++;
        }
        b(r1);
        return true;
    }

    public static void b() {
        au.a(0, 0, au.m41b(), au.c());
    }

    public static void a(int r5, String str, int[] r7, int r8, int r9, int r10, int r11) {
        int r12;
        int r13;
        if (r7 == null) {
            r12 = au.m41b();
            r13 = au.c();
        } else {
            r8 += r7[0];
            r9 += r7[1];
            r12 = r7[2];
            r13 = r7[3];
        }
        au.m47a(r5, str, r8 + (((r12 - au.a(r5, str)) * r10) >> 13), r9 + (((r13 - au.m46c(r5)) * r11) >> 13));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00dc A[LOOP:3: B:50:0x00d6->B:52:0x00dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d6 A[SYNTHETIC] */
    public static boolean a(int[] r6, int r7, String str, int r9, boolean z) {
        if (r9 <= 0) {
            return false;
        }
        int length = str.length();
        for (int r12 = r6[0]; r12 < length; r12++) {
            if (!a(str.charAt(r12))) {
                int r14 = 0;
                int r13 = r12;
                while (r13 < length) {
                    int r1 = r13;
                    r13++;
                    char cCharAt = str.charAt(r1);
                    char cCharAt2 = r13 < length ? str.charAt(r13) : (char) 0;
                    char c = cCharAt2;
                    boolean z2 = cCharAt2 == '\n';
                    if (z2 | (r13 == length) | a(cCharAt) | (cCharAt == 173) | aj.a(c)) {
                        int r0 = au.a(r7, str, r12, r13 - r12);
                        int r15 = r0;
                        boolean z3 = r0 > r9;
                        boolean z4 = z3;
                        if (z3) {
                            if (r14 > 0) {
                                r13 = r14;
                                break;
                            }
                            if (!z) {
                                return false;
                            }
                            if (z2 || z4) {
                                while (r15 > r9) {
                                    r13--;
                                    r15 = au.a(r7, str, r12, r13 - r12);
                                }
                            } else {
                                r14 = r13;
                            }
                        } else if (z2 || z4) {
                            while (r15 > r9) {
                                r13--;
                                r15 = au.a(r7, str, r12, r13 - r12);
                            }
                        } else {
                            r14 = r13;
                        }
                    }
                }
                while (a(str.charAt(r13 - 1))) {
                    r13--;
                }
                r6[0] = r12;
                r6[1] = r13;
                return true;
            }
        }
        return false;
    }

    public static boolean a(char c) {
        return c == ' ' || c == '\n' || c == 8203;
    }

    public static void a(int[] r4) {
        r4[0] = 0;
        r4[1] = 0;
        r4[2] = au.m41b();
        r4[3] = au.c();
    }
}
