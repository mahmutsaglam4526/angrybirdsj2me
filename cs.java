package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:cs.class */
public final class cs {
    private ag[] a = new ag[250];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f202a = 0;
    private int b = 0;
    private int c;
    private int d;
    private int e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private float f203a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private float f204b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private float f205c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private float f206d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private float f207e;
    private float f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[] f208a = {16711680, 48127, 16768256, 16777215, 1157700, 5592405};

    public final void a() {
        this.b++;
        this.c = 0;
        this.f203a = -10000.0f;
        this.f204b = -10000.0f;
        this.d = 0;
        this.f205c = -10000.0f;
        this.f206d = -10000.0f;
        this.e = 0;
        this.f207e = -10000.0f;
        this.f = -10000.0f;
    }

    public final void b() {
        for (int r5 = 0; r5 <= this.f202a; r5++) {
            if (this.a[r5] != null && this.a[r5].f18a == this.b - 1) {
                a(r5);
            }
        }
    }

    public final void c() {
        int r4 = 0;
        for (int r5 = 0; r5 <= this.f202a; r5++) {
            if (this.a[r5] != null) {
                if (this.a[r5].a(33)) {
                    a(r5);
                } else {
                    r4 = r5;
                }
            }
        }
        this.f202a = r4;
        int r0 = this.f202a;
    }

    public final void d() {
        for (int r4 = 0; r4 <= this.f202a; r4++) {
            if (this.a[r4] != null && this.a[r4].f19a) {
                this.a[r4].a();
            }
        }
    }

    public final void e() {
        for (int r4 = 0; r4 <= this.f202a; r4++) {
            if (this.a[r4] != null && !this.a[r4].f19a) {
                this.a[r4].a();
            }
        }
    }

    private void a(int r5) {
        if (this.a[r5] != null) {
            ag[] agVarArr = this.a;
        }
        this.a[r5] = null;
    }

    /* JADX WARN: Code duplicated, block: B:225:0x04cf  */
    public final void a(int r18, float f, float f2, float f3, float f4) {
        int r0;
        float f5;
        int[] r4;
        if (r18 == 0) {
            return;
        }
        if (r18 == 16) {
            float f6 = f - this.f203a;
            float f7 = f2 - this.f204b;
            if ((f6 * f6) + (f7 * f7) < 20.0f) {
                return;
            }
            this.f203a = f;
            this.f204b = f2;
        }
        if (r18 == 17) {
            float f8 = f - this.f205c;
            float f9 = f2 - this.f206d;
            if ((f8 * f8) + (f9 * f9) < 20.0f) {
                return;
            }
            this.f205c = f;
            this.f206d = f2;
        }
        if (r18 == 18) {
            float f10 = f - this.f207e;
            float f11 = f2 - this.f;
            if ((f10 * f10) + (f11 * f11) < 20.0f) {
                return;
            }
            this.f207e = f;
            this.f = f2;
        }
        int r23 = 0;
        float fSqrt = (float) Math.sqrt(f3);
        int r21 = (m122a(r18) || d(r18) || r18 == 11 || r18 == 12 || r18 == 20 || r18 == 16 || r18 == 17 || r18 == 18 || r18 == 19 || r18 == 0) ? 1 : 1 + ((int) (((double) (f3 * f4)) * 0.4d));
        for (int r25 = 0; r25 < r21; r25++) {
            int r1 = m123b(r23);
            r23 = r1;
            if (r1 < 0) {
                return;
            }
            float fA = a(r18, f, fSqrt);
            float fA2 = a(r18, f2, fSqrt);
            float fNextFloat = (m122a(r18) || d(r18) || r18 == 11 || r18 == 12 || r18 == 20 || r18 == 16 || r18 == 17 || r18 == 18 || r18 == 19 || r18 == 0) ? 0.0f : az.f96a.nextFloat() * 6.2831855f;
            float fNextFloat2 = b(r18) ? (-1.0f) + (az.f96a.nextFloat() * 2.0f) : c(r18) ? (-2.5f) + (az.f96a.nextFloat() * 5.0f) : 0.0f;
            float fNextFloat3 = b(r18) ? (-1.0f) + (az.f96a.nextFloat() * 2.0f) : c(r18) ? (-2.0f) + (az.f96a.nextFloat() * 4.0f) : 0.0f;
            float fNextFloat4 = (b(r18) || c(r18)) ? (-1.5707964f) + (az.f96a.nextFloat() * 3.1415927f) : 0.0f;
            if (b(r18)) {
                r0 = (int) (1250.0f + (az.f96a.nextFloat() * 250.0f * f4));
            } else if (c(r18)) {
                r0 = 1500;
            } else if (m122a(r18) || r18 == 11) {
                r0 = 500;
            } else if (r18 == 12) {
                r0 = 400;
            } else if (d(r18)) {
                r0 = 1000;
            } else if (r18 == 20) {
                r0 = 350;
            } else {
                r0 = (r18 == 16 || r18 == 17 || r18 == 18 || r18 == 19) ? -1 : -1;
            }
            int r32 = r0;
            if (b(r18)) {
                f5 = 1.0f;
            } else if (d(r18)) {
                f5 = -5.0f;
            } else if (r18 == 8) {
                f5 = 8.0f;
            } else if (r18 == 7) {
                f5 = 6.0f;
            } else {
                f5 = r18 == 9 ? 5.0f : 0.0f;
            }
            float f12 = f5;
            boolean z = r18 == 16 || r18 == 17 || r18 == 18 || r18 == 19 || b(r18);
            int r35 = (r18 == 16 || r18 == 17 || r18 == 18 || r18 == 19) ? this.b : -1;
            ag[] agVarArr = this.a;
            if (b(r18)) {
                int r37 = r18 == 2 ? 197 : 194;
                if (r18 == 5) {
                    r37 = 191;
                }
                if (r18 == 3) {
                    r37 = 188;
                }
                if (r18 == 4) {
                    r37 = 185;
                }
                if (r18 == 6) {
                    r37 = 185;
                }
                int r38 = (int) (r37 + (az.f96a.nextFloat() * 3.0f));
                if (az.f96a.nextFloat() > 0.9d || az.f96a.nextFloat() > 0.9d) {
                    r38 = 168;
                }
                r4 = new int[]{r38};
            } else if (d(r18)) {
                r4 = new int[]{r18 == 27 ? 201 : 200};
            } else if (m122a(r18) || r18 == 11) {
                r4 = new int[]{166, 167};
            } else if (r18 == 12) {
                r4 = new int[]{168};
            } else if (r18 == 20) {
                r4 = new int[]{172, 173};
            } else if (c(r18)) {
                int r39 = r18 == 7 ? (int) (174.0f + (az.f96a.nextFloat() * 3.0f)) : 168;
                if (r18 == 8) {
                    r39 = (int) (177.0f + (az.f96a.nextFloat() * 3.0f));
                }
                if (r18 == 9) {
                    r39 = (int) (180.0f + (az.f96a.nextFloat() * 5.0f));
                }
                r4 = new int[]{r39};
            } else if (r18 == 16) {
                int r5 = 169 + this.c;
                this.c = (this.c + 1) % 3;
                r4 = new int[]{r5};
            } else if (r18 == 17) {
                int r6 = 169 + this.d;
                this.d = (this.d + 1) % 3;
                r4 = new int[]{r6};
            } else if (r18 == 18) {
                int r7 = 169 + this.e;
                this.e = (this.e + 1) % 3;
                r4 = new int[]{r7};
            } else {
                r4 = new int[]{168};
            }
            agVarArr[r23] = new ag(r4, (!d(r18) || r18 == 27) ? -1 : (-16777216) | f208a[r18 - 21], r32, fA, fA2, fNextFloat, fNextFloat2, fNextFloat3, fNextFloat4, f12, z, r35);
            this.f202a = q.c(this.f202a, r23);
        }
    }

    public final void a(String str, float f, float f2) {
        int r0 = m123b(0);
        if (r0 < 0) {
            return;
        }
        this.a[r0] = new ag(str, f, f2);
        this.f202a = q.c(this.f202a, r0);
    }

    private static float a(int r5, float f, float f2) {
        return (m122a(r5) || d(r5) || r5 == 11 || r5 == 12 || r5 == 20 || r5 == 16 || r5 == 17 || r5 == 18 || r5 == 19 || r5 == 0) ? f : (f - f2) + (az.f96a.nextFloat() * f2 * 2.0f);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m122a(int r3) {
        return r3 == 15 || r3 == 14 || r3 == 13;
    }

    private static boolean b(int r3) {
        return r3 == 1 || r3 == 5 || r3 == 3 || r3 == 6 || r3 == 4 || r3 == 2;
    }

    private static boolean c(int r3) {
        return r3 == 9 || r3 == 8 || r3 == 7;
    }

    private static boolean d(int r3) {
        return r3 == 26 || r3 == 22 || r3 == 25 || r3 == 21 || r3 == 24 || r3 == 23 || r3 == 27;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private final int m123b(int r4) {
        while (r4 < 250) {
            if (this.a[r4] == null) {
                return r4;
            }
            r4++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static int m124a(int r3) {
        if (r3 == 55) {
            return 21;
        }
        if (r3 == 57) {
            return 23;
        }
        if (r3 == 59) {
            return 26;
        }
        if (r3 == 56) {
            return 22;
        }
        return r3 == 58 ? 24 : 0;
    }
}
