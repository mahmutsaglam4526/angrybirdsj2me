package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:y.class */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f433a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private int f434b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private int f435c;
    private int d;
    private int e;
    private int f;
    private static int[] a = new int[2];

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static final int[] f437c = new int[2];

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static final int[] f438d = new int[2];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final v f431a = new v();
    private final v b = new v();
    private final v c = new v();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final l f432a = new l();

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private int[] f436b = new int[17];

    public y() {
        this.f431a.m199a();
        this.b.m199a();
        this.f432a.a = 0;
        this.f433a = 0;
        this.d = 1;
        this.e = 65536;
        this.f = 0;
    }

    public final int a() {
        return this.f434b;
    }

    public final int b() {
        return this.f435c;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m201a() {
        this.d = 5;
    }

    private void a(String str) {
        int r0;
        int r1;
        v vVar = this.c;
        int r9 = 0;
        Object[] objArrM198a = vVar.m198a();
        int r2 = vVar.a();
        while (true) {
            if (r9 >= r2) {
                r0 = -1;
                break;
            } else {
                if (objArrM198a[r9] == null) {
                    r0 = r9;
                    break;
                }
                r9++;
            }
        }
        int r3 = r0;
        if (r0 >= 0) {
            vVar.m198a()[r3] = str;
            r1 = r3;
        } else {
            r1 = vVar.a(str);
        }
        this.f431a.a(new int[]{9, r1});
        this.f = 0;
    }

    public final void a(String str, int r7, int r8) {
        a(str.substring(r7, r8));
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final void m202b() {
        a(new StringBuffer().append("").append(' ').toString());
    }

    public final void a(int r6) {
        this.f431a.a(new int[]{1, r6});
        this.f = 0;
    }

    public final void b(int r6) {
        this.f431a.a(new int[]{4, r6});
        this.f = 0;
    }

    public final void c(int r6) {
        this.f431a.a(new int[]{5, r6, r6});
        this.f = 0;
    }

    public final void a(int r6, int r7) {
        this.f431a.a(new int[]{5, r6, r7});
        this.f = 0;
    }

    public final void d(int r6) {
        this.f431a.a(new int[]{6, r6});
        this.f = 0;
    }

    public final void c() {
        e(0);
    }

    public final void e(int r6) {
        this.f431a.a(new int[]{7, r6});
        this.f = 0;
    }

    public final void d() {
        this.f431a.a(new int[]{10, 0});
        this.f = 0;
    }

    public final void f(int r6) {
        this.f431a.a(new int[]{8, r6});
        this.f = 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private int[] m203a(int r4) {
        return (int[]) this.f431a.a(r4);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0246  */
    /* JADX WARN: Code duplicated, block: B:64:0x024f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0253  */
    /* JADX WARN: Code duplicated, block: B:68:0x025b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0290  */
    /* JADX WARN: Code duplicated, block: B:79:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:80:0x02bb  */
    public final void a(int r12, boolean z) {
        char c;
        char c2;
        boolean z2;
        if (this.f == r12) {
            return;
        }
        this.f = r12;
        int r0 = this.f431a.a();
        this.b.m199a();
        this.f434b = 0;
        this.f435c = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        int[] r1 = new int[10];
        r1[6] = 0;
        r1[7] = 0;
        r1[8] = this.e;
        r1[4] = this.d;
        r1[5] = 0;
        boolean z3 = false;
        int r20 = 0;
        while (r17 < r0) {
            int r2 = r1[6];
            int r3 = r1[7];
            int r4 = r17;
            int r5 = r1[1];
            int r6 = r12 - r15;
            boolean z4 = r15 == 0;
            az.a(r1);
            int[] r7 = m203a(r4);
            int r8 = r7[0];
            int r9 = r7[1];
            r1[0] = r8;
            r1[1] = 0;
            r1[9] = 0;
            String strM55a = null;
            if (r8 == 0) {
                strM55a = av.m55a(r9);
            } else if (r8 == 9) {
                strM55a = (String) this.c.a(r9);
            } else if (r8 == 1) {
                if (r9 > 0) {
                    r1[2] = au.m43a(r9);
                    r1[3] = au.m44b(r9);
                }
            } else if (r8 == 4) {
                r1[4] = r9;
            } else if (r8 == 2) {
                r1[2] = r7[2];
                r1[3] = r7[3];
            } else if (r8 == 8) {
                r1[2] = r9;
            } else {
                if (r8 == 7) {
                    r1[3] = r9;
                    c = 1;
                } else if (r8 == 10) {
                    r1[9] = r1[9] | 1;
                    c = 1;
                } else if (r8 == 5) {
                    r1[6] = r9;
                    r1[7] = r7[2];
                    c = 2;
                } else if (r8 == 6) {
                    r1[8] = r9;
                }
                c2 = c;
                if (c != 3) {
                    r15 += r1[2];
                    r16 = q.c(r16, r1[3]);
                }
                r20 |= r1[9];
                if (c2 != 1 || c2 == 3 || (c2 == 2 && r15 > 0)) {
                    a(r12, r2, r3, r15, r16, r17, r1[1], z3, r20);
                    r16 = 0;
                    r15 = 0;
                    r20 = 0;
                    if (c2 == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2;
                }
                if (c2 == 3 && r1[1] == 0) {
                    r17++;
                }
            }
            if (strM55a != null) {
                r1[3] = au.m46c(r1[4]);
                int length = strM55a.length();
                r1[2] = au.a(r1[4], strM55a, r5, length - r5);
                if (r1[2] > r6) {
                    a[0] = r5;
                    a[1] = length;
                    boolean zA = ae.a(a, r1[4], strM55a, r6, z4);
                    if (z4 || zA) {
                        int r10 = a[0];
                        int r11 = a[1];
                        int r25 = r11;
                        if (r11 <= length) {
                            r1[2] = au.a(r1[4], strM55a, r10, r25 - r10);
                            while (r25 < length && ae.a(strM55a.charAt(r25))) {
                                r25++;
                            }
                            r1[1] = r25;
                            c = 1;
                        } else if (r1[2] > r6) {
                            c = 1;
                        } else {
                            c = 0;
                        }
                    } else {
                        r1[2] = 0;
                        c = 3;
                    }
                } else if (r1[2] > r6) {
                    c = 1;
                } else {
                    c = 0;
                }
            } else if (r1[2] > r6) {
                c = 1;
            } else {
                c = 0;
            }
            c2 = c;
            if (c != 3) {
                r15 += r1[2];
                r16 = q.c(r16, r1[3]);
            }
            r20 |= r1[9];
            if (c2 != 1) {
                a(r12, r2, r3, r15, r16, r17, r1[1], z3, r20);
                r16 = 0;
                r15 = 0;
                r20 = 0;
                if (c2 == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2;
            } else {
                a(r12, r2, r3, r15, r16, r17, r1[1], z3, r20);
                r16 = 0;
                r15 = 0;
                r20 = 0;
                if (c2 == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2;
            }
            if (c2 == 3) {
            }
        }
        if (r15 > 0) {
            a(r12, r1[6], r1[7], r15, r16, r0, 0, z3, r20);
        }
        if (this.b.a() > 0) {
            this.f434b = r12;
            if (z) {
                int r21 = 0;
                int r22 = 0;
                for (int r23 = 0; r23 < 2; r23++) {
                    for (int r13 = 0; r13 < this.b.a(); r13++) {
                        int[] r14 = (int[]) this.b.a(r13);
                        if (r23 == 0) {
                            int r18 = r12 >> 1;
                            int r19 = r18;
                            int r110 = r18;
                            if (r14[2] > 0) {
                                r19 = r14[0];
                                r110 = (r12 - r14[0]) - r14[2];
                            }
                            if (r13 == 0) {
                                r21 = r19;
                                r22 = r110;
                            } else {
                                r21 = q.b(r21, r19);
                                r22 = q.b(r22, r110);
                            }
                        } else {
                            r14[0] = r14[0] - r21;
                        }
                    }
                }
                this.f434b = (r12 - r21) - r22;
            }
            int[] r24 = (int[]) this.b.a(this.b.a() - 1);
            this.f435c = r24[1] + r24[3];
        }
    }

    private int[] a(int r8, int r9, int r10, int r11, int r12, int r13, int r14, boolean z, int r16) {
        int length;
        String strM55a;
        boolean z2 = true;
        int r0 = an.a((r9 * r8) - (r10 * r11));
        int r19 = 0;
        if (this.b.a() > 0) {
            int[] r1 = (int[]) this.b.a(this.b.a() - 1);
            r19 = r1[1] + r1[3];
            if (z) {
                a(f437c, r11, r8, r9, r10);
                a(f438d, r1[2], r8, r1[6], r1[7]);
                int[] r2 = f437c;
                int[] r3 = f438d;
                if (!(r2[0] < r3[1] && r2[1] > r3[0])) {
                    r19 = r1[1];
                    int r4 = q.c(r12, r1[3]);
                    r1[3] = r4;
                    r12 = r4;
                    z2 = false;
                }
            }
        }
        if (z2) {
            this.f432a.a(this.b.a());
            this.f432a.a(this.f433a);
        }
        int[] r5 = {r0, r19, r11, r12, r13, r14, r9, r10, r16};
        this.b.a(r5);
        int r15 = 0;
        a(this.f436b);
        while (m204a(this.f436b)) {
            int r6 = r15;
            int[] r7 = this.f436b;
            int r17 = r7[4];
            int r18 = r7[15];
            int[] r20 = m203a(r18);
            switch (r17) {
                case 0:
                    strM55a = av.m55a(r20[1]);
                    break;
                case 1:
                case 2:
                    length = 1;
                    continue;
                    r15 = r6 + length;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                default:
                    length = 0;
                    continue;
                    r15 = r6 + length;
                    break;
                case 9:
                    strM55a = (String) this.c.a(r20[1]);
                    break;
            }
            length = (r18 == r7[9] ? r7[11] : strM55a.length()) - r7[16];
            r15 = r6 + length;
        }
        this.f433a = r15;
        return r5;
    }

    private static void a(int[] r6, int r7, int r8, int r9, int r10) {
        r6[0] = ((r9 * r8) - (r10 * r7)) >> 16;
        r6[1] = r6[0] + r7;
    }

    private void a(int[] r5) {
        ab.a(r5, 0);
        r5[5] = -1;
        r5[6] = this.d;
        r5[7] = this.e;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private boolean m204a(int[] r7) {
        int r12;
        while (true) {
            int r0 = this.b.a();
            int r1 = r7[5];
            if (r1 >= r0) {
                return false;
            }
            int r10 = r7[8];
            int r2 = r7[9];
            int r3 = r7[10];
            int r4 = r7[11];
            if (r10 < r2 || (r4 > 0 && r3 < r4)) {
                r7[15] = r10;
                r7[16] = r3;
                int r8 = 0;
                int r9 = 0;
                int[] r5 = m203a(r10);
                int r6 = r5[0];
                int r11 = r5[1];
                r7[4] = r6;
                String strM55a = null;
                if (r6 == 0) {
                    strM55a = av.m55a(r11);
                } else if (r6 == 9) {
                    strM55a = (String) this.c.a(r11);
                } else if (r6 == 1) {
                    if (r11 > 0) {
                        r8 = au.m43a(r11);
                        r9 = au.m44b(r11);
                    }
                } else if (r6 != 3) {
                    if (r6 == 4) {
                        r7[6] = r11;
                    } else if (r6 == 2) {
                        r8 = r5[2];
                        r9 = r5[3];
                    } else if (r6 == 8) {
                        r8 = r11;
                    } else if (r6 == 7) {
                        r9 = r11;
                    } else if (r6 != 5 && r6 == 6) {
                        r7[7] = r11;
                    }
                }
                if (strM55a != null) {
                    r7[4] = r6;
                    r8 = au.a(r7[6], strM55a, r3, (r10 == r2 ? r4 : strM55a.length()) - r3);
                    r9 = au.m46c(r7[6]);
                }
                int r13 = r7[13];
                int r14 = r7[14] + an.a(r7[7] * (r7[12] - r9));
                r7[0] = r13;
                r7[1] = r14;
                r7[2] = r8;
                r7[3] = r9;
                r7[13] = r7[13] + r8;
                if (r10 < r2) {
                    r10++;
                    r12 = 0;
                } else {
                    r12 = r4;
                }
                r7[8] = r10;
                r7[10] = r12;
                return true;
            }
            if (r1 + 1 >= r0) {
                return false;
            }
            int r15 = r1 + 1;
            r7[5] = r15;
            int[] r16 = (int[]) this.b.a(r15);
            r7[13] = r16[0];
            r7[14] = r16[1];
            r7[12] = r16[3];
            r7[9] = r16[4];
            r7[11] = r16[5];
        }
    }

    public final void b(int r8, int r9) {
        int r11 = this.f433a;
        int r13 = this.d;
        int r0 = au.e();
        a(this.f436b);
        int r1 = au.g();
        int i = r1 + au.i();
        while (m204a(this.f436b) && r11 > 0) {
            boolean z = false;
            int r2 = this.f436b[15];
            int r3 = this.f436b[4];
            int r4 = r8 + this.f436b[0];
            int r5 = r9 + this.f436b[1];
            int[] r6 = this.f436b;
            int r7 = this.f436b[3];
            au.m49a();
            if (r5 + r7 >= r1 && r5 < i) {
                z = true;
            }
            int r10 = m203a(r2)[1];
            String strM55a = null;
            if (r3 == 0) {
                strM55a = av.m55a(r10);
            } else if (r3 == 9) {
                strM55a = (String) this.c.a(r10);
            } else if (r3 == 1) {
                if (z && r10 > 0) {
                    au.a(r10, r4, r5);
                }
                r11--;
            } else if (r3 == 3) {
                au.a(r0, r10);
            } else if (r3 == 4) {
                r13 = r10;
            } else if (r3 == 2) {
                ba.a.m33a();
                r11--;
            }
            if (z && strM55a != null) {
                int length = strM55a.length();
                int r12 = this.f436b[16];
                int r14 = (r2 == this.f436b[9] ? this.f436b[11] : length) - r12;
                if (r11 < r14) {
                    r14 = r11;
                }
                au.a(r13, strM55a, r12, r14, r4, r5);
                r11 -= r14;
            }
        }
    }

    public final String toString() {
        return super.toString();
    }
}
