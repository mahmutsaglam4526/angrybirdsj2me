package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:cr.class */
public final class cr {
    public co a;
    public int b;
    private int d;
    private int e;
    public int c;
    private static int f = 1;
    private static int g = 2;
    private static int h = 3;
    private static int i = 4;
    private static int j = 5;
    private static int k = 6;
    private static int l = 7;
    private static int m = 8;
    private static int n = 9;
    private static int o = 10;
    private static int p = 11;
    private static int q = 12;
    private static int r = 13;
    private static int s = 14;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static float[] f201a = new float[15];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public cv[] f198a = new cv[cq.f195c];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private af[] f200a = new af[10];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f199a = 0;

    public cr(co coVar, cq cqVar) {
        this.a = coVar;
        a((short) 0, 0.0f, 0.0f, 0.0f);
        float f2 = 0.0f;
        if (cqVar.f183a[0] == 56) {
            f2 = cz.a[33].f236a;
        } else if (cqVar.f183a[0] == 55) {
            f2 = cz.a[31].f236a;
        } else if (cqVar.f183a[0] == 59) {
            f2 = cz.a[35].f236a;
        } else if (cqVar.f183a[0] == 58) {
            f2 = cz.a[34].f236a;
        } else if (cqVar.f183a[0] == 57) {
            f2 = cz.a[32].f236a;
        }
        a((short) 1, cqVar.g, cqVar.h + f2, 0.0f);
        for (int r8 = 0; r8 < cqVar.f191b; r8++) {
            if (cqVar.f187b[r8] != -1) {
                short s2 = cqVar.f187b[r8];
                if (cx.a(s2) != null) {
                    a(s2, cqVar.f188c[r8], cqVar.f189d[r8], cqVar.f190e[r8] * 0.0174533f);
                }
            }
        }
        for (int r9 = 0; r9 < cqVar.f186a; r9++) {
            a(cqVar.f183a[r9], cqVar.f184a[r9], cqVar.f185b[r9], 0.0f);
        }
        this.b = -1;
        this.d = -1;
        this.e = -1;
        this.c = 0;
    }

    private void a(short s2, float f2, float f3, float f4) {
        this.f198a[this.f199a] = new cv(this.a.m106a(), s2, f2, f3, f4);
        this.f199a++;
    }

    public final cv a(int r11, short s2, float f2, float f3) {
        if (this.f198a[r11] != null) {
            a(r11, false);
            this.f198a[r11] = null;
        }
        this.f198a[r11] = new cv(this.a.m106a(), s2, f2, f3, 0.0f);
        return this.f198a[r11];
    }

    public final boolean a(boolean z) {
        for (int r5 = 0; r5 < this.f199a; r5++) {
            if (this.f198a[r5] != null) {
                if (!this.f198a[r5].a(5.0f)) {
                    return false;
                }
                if (z && this.f198a[r5].c() && !this.f198a[r5].b && !this.f198a[r5].g()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void a(fe feVar) {
        if (a(feVar, true)) {
            cv cvVar = (cv) feVar.f360a.f335a.f40a;
            cv cvVar2 = (cv) feVar.f361b.f335a.f40a;
            f201a[0] = 1.0f;
            f201a[g] = 1.0f;
            f201a[f] = 1.0f;
            f201a[h] = 1.0f;
            f201a[0] = cvVar.a(cvVar2.a());
            f201a[g] = cvVar.b(cvVar2.a());
            f201a[f] = cvVar2.a(cvVar.a());
            f201a[h] = cvVar2.b(cvVar.a());
            f201a[j] = (cvVar.f216a.f38b * cvVar.f216a.f29a.f60a) - (cvVar2.f216a.f38b * cvVar2.f216a.f29a.f60a);
            f201a[k] = (cvVar.f216a.f38b * cvVar.f216a.f29a.b) - (cvVar2.f216a.f38b * cvVar2.f216a.f29a.b);
            f201a[i] = ((float) Math.sqrt((f201a[j] * f201a[j]) + (f201a[k] * f201a[k]))) / 10.0f;
            f201a[l] = f201a[0] * f201a[i];
            f201a[m] = f201a[f] * f201a[i];
            f201a[n] = Math.max(0.0f, cvVar.f217a);
            f201a[o] = Math.max(0.0f, cvVar2.f217a);
            f201a[p] = cvVar.a(f201a[m], true, cvVar2.c());
            f201a[q] = cvVar2.a(f201a[l], true, cvVar.c());
            cvVar.e = true;
            cvVar2.e = true;
            if (f201a[p] <= 0.0f) {
                f201a[s] = (f201a[m] - f201a[n]) / f201a[m];
                float[] fArr = f201a;
                int r1 = s;
                fArr[r1] = fArr[r1] * f201a[h];
                if (f201a[s] > 1.0d) {
                    f201a[s] = 1.0f;
                }
                if (cvVar2.f226a != null) {
                    cvVar2.f226a.f60a = cvVar2.f216a.f29a.f60a * f201a[s];
                    cvVar2.f226a.b = cvVar2.f216a.f29a.b * f201a[s];
                } else {
                    cvVar2.f226a = new ap(cvVar2.f216a.f29a.f60a * f201a[s], cvVar2.f216a.f29a.b * f201a[s]);
                }
            }
            if (f201a[q] <= 0.0f) {
                f201a[r] = (f201a[l] - f201a[o]) / f201a[l];
                float[] fArr2 = f201a;
                int r2 = r;
                fArr2[r2] = fArr2[r2] * f201a[g];
                if (f201a[r] > 1.0d) {
                    f201a[r] = 1.0f;
                }
                if (cvVar.f226a == null) {
                    cvVar.f226a = new ap(cvVar.f216a.f29a.f60a * f201a[r], cvVar.f216a.f29a.b * f201a[r]);
                    return;
                }
                cvVar.f226a.f60a = cvVar.f216a.f29a.f60a * f201a[r];
                cvVar.f226a.b = cvVar.f216a.f29a.b * f201a[r];
            }
        }
    }

    public static boolean a(fe feVar, boolean z) {
        cv cvVar = (cv) feVar.f360a.f335a.f40a;
        cv cvVar2 = (cv) feVar.f361b.f335a.f40a;
        if (cvVar == null || cvVar2 == null || cvVar.f219a || cvVar2.f219a) {
            return false;
        }
        if (cvVar.c() && cvVar2.d()) {
            return false;
        }
        if (cvVar2.c() && cvVar.d()) {
            return false;
        }
        if (cvVar.c() && cvVar2.b) {
            return false;
        }
        if (cvVar2.c() && cvVar.b) {
            return false;
        }
        if (cvVar.i() && cvVar2.i() && cvVar.g() && cvVar2.g()) {
            return false;
        }
        if (cvVar.f() && cvVar2.h()) {
            return false;
        }
        if (cvVar2.f() && cvVar.h()) {
            return false;
        }
        if (!z) {
            return true;
        }
        if (cvVar.a(10.0f) && cvVar2.a(10.0f)) {
            return false;
        }
        return (cvVar.c() && cvVar2.c()) ? false : true;
    }

    public final void a() {
        for (int r7 = 0; r7 < this.f199a; r7++) {
            if (this.f198a[r7] != null) {
                cv cvVar = this.f198a[r7];
                if (cvVar.f217a <= 0.0f) {
                    a(r7, true);
                } else {
                    if (cvVar.f226a != null) {
                        cvVar.f216a.a(new ap(cvVar.f226a.f60a, cvVar.f226a.b));
                        cvVar.f226a = null;
                    }
                    if (cvVar.g()) {
                        if (cvVar.f227b != -99999.0f) {
                            float fMin = cvVar.f216a.f29a.f60a;
                            if (cvVar.f227b < fMin) {
                                fMin = Math.max(cvVar.f227b, fMin - 0.002475f);
                            } else if (cvVar.f227b > fMin) {
                                fMin = Math.min(cvVar.f227b, fMin + 0.002475f);
                            }
                            cvVar.f216a.f29a.f60a = fMin;
                        }
                        if (cvVar.f228c != -99999.0f) {
                            float f2 = cvVar.f228c < 0.0f ? 0.002475f : 4.95E-4f;
                            float fMax = cvVar.f216a.f29a.b;
                            if (cvVar.f228c < fMax) {
                                fMax = Math.max(cvVar.f227b, fMax - f2);
                            }
                            cvVar.f216a.f29a.b = fMax;
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        boolean z;
        int r10 = 0;
        for (int r11 = 0; r11 < this.f199a; r11++) {
            if (this.f198a[r11] != null && this.f198a[r11].b()) {
                r10++;
            }
        }
        float f2 = r10;
        int r12 = 0;
        for (int r13 = 0; r13 < this.f199a; r13++) {
            if (this.f198a[r13] != null && this.f198a[r13].c()) {
                r12++;
            }
        }
        float f3 = r12;
        for (int r14 = 0; r14 < this.f199a; r14++) {
            if (this.f198a[r14] != null) {
                cv cvVar = this.f198a[r14];
                cv cvVar2 = cvVar;
                if (cvVar.l() || cvVar2.o()) {
                    a(r14, true);
                } else {
                    if (cvVar2.f224d > 0) {
                        cvVar2.f223c += 33;
                        if (cvVar2.f223c >= cvVar2.f224d) {
                            if (cvVar2.j()) {
                                ap apVar = cvVar2.f216a.f27a.a;
                                a(1, apVar.f60a, apVar.b);
                            }
                            cvVar2 = null;
                            a(r14, true);
                        }
                    }
                    if (cvVar2 != null) {
                        if (cvVar2.c() && cvVar2.g() && r14 == this.b) {
                            cvVar2.f();
                        }
                        if (cvVar2.f220b > 0) {
                            cvVar2.f220b -= 33;
                        } else if (cvVar2.f218a <= 0 && r14 != this.b) {
                            if (cvVar2.c() && az.f96a.nextFloat() * 1000.0f * (f3 + 1.0f) < 33.0f) {
                                cvVar2.f220b = 300;
                            } else if (cvVar2.b() && az.f96a.nextFloat() * 1000.0f * (f2 + 1.0f) < 33.0f) {
                                cvVar2.f220b = 300;
                            }
                        }
                        if (cvVar2.f218a > 0 && r14 != this.b) {
                            cvVar2.f218a -= 33;
                        } else if (cvVar2.f220b <= 0 && !co.f170a) {
                            if (cvVar2.c() && !cvVar2.f219a && az.f96a.nextFloat() * 1500.0f * (f3 + 1.0f) < 33.0f) {
                                cvVar2.f218a = 750;
                                if (this.a.f165a.e <= 0.0f && !this.a.f168a.f248a) {
                                    cvVar2.a((short) 3);
                                }
                            } else if (cvVar2.b() && az.f96a.nextFloat() * 1500.0f * (f2 + 1.0f) < 33.0f) {
                                cvVar2.f218a = 750;
                                if (this.a.f165a.e >= 10000.0f) {
                                    cvVar2.a((short) 3);
                                }
                            }
                        }
                        if (cvVar2.c() && cvVar2.b && !cvVar2.f219a && !cvVar2.f216a.b() && az.f96a.nextFloat() * 3000.0f < 33.0f) {
                            cvVar2.f216a.a(new ap(0.0f, (-(10.0f + (az.f96a.nextFloat() * 5.0f))) * cvVar2.f216a.f38b), cvVar2.f216a.f27a.a);
                        }
                    }
                }
            }
        }
        c();
        for (int r15 = 0; r15 < this.f200a.length; r15++) {
            if (this.f200a[r15] != null) {
                af afVar = this.f200a[r15];
                cv[] cvVarArr = this.f198a;
                afVar.g -= 33.0f;
                if (afVar.g <= 0.0f) {
                    for (cv cvVar3 : cvVarArr) {
                        if (cvVar3 != null && (!cvVar3.c() || !cvVar3.b)) {
                            ap apVar2 = cvVar3.f216a.f27a.a;
                            float f4 = apVar2.f60a - afVar.a;
                            float f5 = apVar2.b - afVar.b;
                            float fA = co.a(f4, f5);
                            float f6 = afVar.c;
                            float f7 = afVar.e;
                            if (fA <= f6) {
                                float fMax = afVar.d / Math.max(1.0f, (int) fA);
                                cvVar3.f216a.a(new ap(fMax * (f4 / fA), fMax * (f5 / fA)), new ap(afVar.a, afVar.b));
                            }
                            if (fA <= f7) {
                                cvVar3.a(afVar.f / Math.max(1.0f, (int) fA), false, false);
                            }
                        }
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.a.f169a.a(20, this.f200a[r15].a, this.f200a[r15].b, 1.0f, 1.0f);
                    int r0 = this.f200a[r15].f12a;
                    db.a(32, true);
                    this.f200a[r15] = null;
                }
            }
        }
    }

    private boolean a(int r9, float f2, float f3) {
        for (int r12 = 0; r12 < this.f200a.length; r12++) {
            if (this.f200a[r12] == null) {
                this.f200a[r12] = new af(r9, f2, f3);
                return true;
            }
        }
        return false;
    }

    public final void c() {
        if (this.b >= 0) {
            if (this.f198a[this.b] == null || !this.f198a[this.b].k()) {
                this.b = -1;
                this.c = 0;
                this.a.f169a.b();
            } else if (this.c == 1) {
                if (!this.f198a[this.b].d || this.f198a[this.b].j()) {
                    if (this.f198a[this.b].j() && (this.f198a[this.b].f224d <= 0 || this.f198a[this.b].f224d > 100)) {
                        if (this.f198a[this.b].f224d > 0) {
                            this.f198a[this.b].f223c = 100 * (this.f198a[this.b].f223c / this.f198a[this.b].f224d);
                        } else {
                            this.f198a[this.b].f223c = 0;
                        }
                        this.f198a[this.b].f224d = 100;
                    } else if (this.f198a[this.b].q()) {
                        this.f198a[this.b].m131a(46.25f);
                    } else if (this.f198a[this.b].i()) {
                        this.f198a[this.b].m131a(0.0f);
                        float f2 = this.f198a[this.b].f216a.f29a.f60a;
                        float f3 = this.f198a[this.b].f216a.f29a.b;
                        float fA = co.a(f2, f3);
                        float f4 = this.f198a[this.b].f216a.f27a.a.f60a;
                        float f5 = this.f198a[this.b].f216a.f27a.a.b;
                        float f6 = (-f2) / fA;
                        float f7 = f3 / fA;
                        a((short) 56, f4 - f7, f5 - f6, 0.0f);
                        this.f198a[this.f199a - 1].f216a.a(new ap(f2 - (7.0f * f7), f3 - (7.0f * f6)));
                        this.f198a[this.f199a - 1].b = false;
                        this.f198a[this.f199a - 1].f216a.m15a();
                        this.f198a[this.f199a - 1].f216a.f35a.c = this.f198a[this.f199a - 1].a().c;
                        this.f198a[this.f199a - 1].f216a.f35a.b = this.f198a[this.f199a - 1].a().f210b;
                        this.d = this.f199a - 1;
                        a((short) 56, f4 + f7, f5 + f6, 0.0f);
                        this.f198a[this.f199a - 1].f216a.a(new ap(f2 + (7.0f * f7), f3 + (7.0f * f6)));
                        this.f198a[this.f199a - 1].b = false;
                        this.f198a[this.f199a - 1].f216a.m15a();
                        this.f198a[this.f199a - 1].f216a.f35a.c = this.f198a[this.f199a - 1].a().c;
                        this.f198a[this.f199a - 1].f216a.f35a.b = this.f198a[this.f199a - 1].a().f210b;
                        this.e = this.f199a - 1;
                    } else if (this.f198a[this.b].f()) {
                        a((short) 60, this.f198a[this.b].f216a.f27a.a.f60a, this.f198a[this.b].f216a.f27a.a.b + 1.0f, 0.0f);
                        this.f198a[this.f199a - 1].f216a.a(new ap(0.0f, 100.0f));
                        this.f198a[this.b].f216a.a(new ap(700.0f, -1400.0f), new ap(this.f198a[this.b].f216a.f27a.a.f60a - 0.5f, this.f198a[this.b].f216a.f27a.a.b));
                        this.f198a[this.b].d = true;
                        this.b = this.f199a - 1;
                    }
                }
                if (!this.f198a[this.b].d) {
                    cv cvVar = this.f198a[this.b];
                    if (cvVar.q()) {
                        db.a(23, true);
                    } else if (cvVar.f()) {
                        db.a(25, true);
                    } else if (cvVar.i()) {
                        db.a(21, true);
                    } else if (cvVar.f214a.a == 55) {
                        db.a(19, true);
                    }
                    if (cvVar.f214a.a != 55) {
                        ap apVar = this.f198a[this.b].f216a.f27a.a;
                        this.a.f169a.a(19, apVar.f60a, apVar.b, 1.0f, 1.0f);
                    }
                }
                if (this.f198a[this.b].c()) {
                    this.f198a[this.b].d = true;
                }
                this.c = 2;
            } else if ((!this.f198a[this.b].f() || !this.f198a[this.b].d) && this.f198a[this.b].g()) {
                ap apVar2 = this.f198a[this.b].f216a.f27a.a;
                this.a.f169a.a(16, apVar2.f60a, apVar2.b, 1.0f, 1.0f);
            }
        }
        if (this.d != -1) {
            this.d = a(this.d, 17);
        }
        if (this.e != -1) {
            this.e = a(this.e, 18);
        }
    }

    private int a(int r8, int r9) {
        if (this.f198a[r8] == null || !this.f198a[r8].g()) {
            return -1;
        }
        ap apVar = this.f198a[r8].f216a.f27a.a;
        this.a.f169a.a(r9, apVar.f60a, apVar.b, 1.0f, 1.0f);
        return r8;
    }

    public final void a(int r8, boolean z) {
        if (z) {
            if (this.f198a[r8].h()) {
                ap apVar = this.f198a[r8].f216a.f27a.a;
                a(0, apVar.f60a, apVar.b);
            } else if (this.f198a[r8].p()) {
                ap apVar2 = this.f198a[r8].f216a.f27a.a;
                a(2, apVar2.f60a, apVar2.b);
            } else if (!this.f198a[r8].c()) {
                this.a.a.a(this.f198a[r8].f214a.f231a);
            }
            ap apVar3 = this.f198a[r8].f216a.f27a.a;
            this.a.f169a.a(this.f198a[r8].f214a.f229a.f213c, apVar3.f60a, apVar3.b, this.f198a[r8].m130a(), 2.5f);
            if (this.f198a[r8].b()) {
                ap apVar4 = this.f198a[r8].f216a.f27a.a;
                this.a.f169a.a(27, apVar4.f60a, apVar4.b - 2.0f, 1.0f, 1.0f);
            }
            if (this.f198a[r8].m()) {
                ap apVar5 = this.f198a[r8].f216a.f27a.a;
                this.a.f169a.a(new StringBuffer().append(this.f198a[r8].f214a.f231a).append("").toString(), apVar5.f60a, apVar5.b - 1.0f);
            }
            this.f198a[r8].a((short) 1);
        }
        this.a.m106a().a(this.f198a[r8].f216a);
        this.f198a[r8] = null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m117a() {
        for (int r4 = 0; r4 < this.f199a; r4++) {
            if (this.f198a[r4] != null && this.f198a[r4].b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final boolean m118b() {
        if (!a(false)) {
            return true;
        }
        for (int r4 = 0; r4 < this.f199a; r4++) {
            if (this.f198a[r4] != null && this.f198a[r4].c()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m119a() {
        int r0;
        int r5 = 0;
        for (int r6 = 0; r6 < this.f199a; r6++) {
            if (this.f198a[r6] != null && this.f198a[r6].c() && (r0 = this.f198a[r6].f214a.a - 55) >= 0 && r0 <= 4) {
                r5 |= 1 << r0;
            }
        }
        return r5;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public final boolean m120c() {
        for (int r8 = 0; r8 < this.f199a; r8++) {
            if (this.f198a[r8] != null && this.f198a[r8].c() && this.f198a[r8].b && !this.f198a[r8].c) {
                this.f198a[r8].c = true;
                this.f198a[r8].f218a = 750;
                this.f198a[r8].a((short) 3);
                this.a.a.a(10000);
                ap apVar = this.f198a[r8].f216a.f27a.a;
                this.a.f169a.a(cs.m124a((int) this.f198a[r8].f214a.a), apVar.f60a, apVar.b - 2.0f, 1.0f, 1.0f);
                return true;
            }
        }
        return false;
    }

    public final void d() {
        for (int r6 = 0; r6 < this.f199a; r6++) {
            if (this.f198a[r6] != null) {
                a(r6, false);
            }
        }
        this.f198a = null;
    }
}
