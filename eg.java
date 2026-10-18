package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:eg.class */
public final class eg {
    private final ap b = new ap();
    private final ap c = new ap();
    public final ap a = new ap();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final ap[] f302a = new ap[2];

    public eg() {
        for (int r6 = 0; r6 < 2; r6++) {
            this.f302a[r6] = new ap();
        }
    }

    public final void a(eb ebVar, es esVar, float f, es esVar2, float f2) {
        if (ebVar.f276b == 0) {
        }
        switch (ebVar.f275a) {
            case 0:
                ap apVar = this.b;
                ap apVar2 = this.c;
                this.a.f60a = 1.0f;
                this.a.b = 0.0f;
                apVar.f60a = esVar.a.f60a + (esVar.f327a.a.f60a * ebVar.b.f60a) + (esVar.f327a.b.f60a * ebVar.b.b);
                apVar.b = esVar.a.b + (esVar.f327a.a.b * ebVar.b.f60a) + (esVar.f327a.b.b * ebVar.b.b);
                apVar2.f60a = esVar2.a.f60a + (esVar2.f327a.a.f60a * ebVar.f273a[0].a.f60a) + (esVar2.f327a.b.f60a * ebVar.f273a[0].a.b);
                apVar2.b = esVar2.a.b + (esVar2.f327a.a.b * ebVar.f273a[0].a.f60a) + (esVar2.f327a.b.b * ebVar.f273a[0].a.b);
                if (ep.a(apVar, apVar2) > 1.4210855E-14f) {
                    this.a.f60a = apVar2.f60a - apVar.f60a;
                    this.a.b = apVar2.b - apVar.b;
                    this.a.m27a();
                }
                float f3 = (this.a.f60a * f) + apVar.f60a;
                float f4 = (this.a.b * f) + apVar.b;
                float f5 = ((-this.a.f60a) * f2) + apVar2.f60a;
                float f6 = ((-this.a.b) * f2) + apVar2.b;
                this.f302a[0].f60a = (f3 + f5) * 0.5f;
                this.f302a[0].b = (f4 + f6) * 0.5f;
                break;
            case 1:
                ap apVar3 = this.b;
                this.a.f60a = (esVar.f327a.a.f60a * ebVar.f274a.f60a) + (esVar.f327a.b.f60a * ebVar.f274a.b);
                this.a.b = (esVar.f327a.a.b * ebVar.f274a.f60a) + (esVar.f327a.b.b * ebVar.f274a.b);
                apVar3.f60a = esVar.a.f60a + (esVar.f327a.a.f60a * ebVar.b.f60a) + (esVar.f327a.b.f60a * ebVar.b.b);
                apVar3.b = esVar.a.b + (esVar.f327a.a.b * ebVar.b.f60a) + (esVar.f327a.b.b * ebVar.b.b);
                ap apVar4 = this.c;
                for (int r14 = 0; r14 < ebVar.f276b; r14++) {
                    apVar4.f60a = esVar2.a.f60a + (esVar2.f327a.a.f60a * ebVar.f273a[r14].a.f60a) + (esVar2.f327a.b.f60a * ebVar.f273a[r14].a.b);
                    apVar4.b = esVar2.a.b + (esVar2.f327a.a.b * ebVar.f273a[r14].a.f60a) + (esVar2.f327a.b.b * ebVar.f273a[r14].a.b);
                    float f7 = f - (((apVar4.f60a - apVar3.f60a) * this.a.f60a) + ((apVar4.b - apVar3.b) * this.a.b));
                    float f8 = (this.a.f60a * f7) + apVar4.f60a;
                    float f9 = (this.a.b * f7) + apVar4.b;
                    float f10 = ((-this.a.f60a) * f2) + apVar4.f60a;
                    float f11 = ((-this.a.b) * f2) + apVar4.b;
                    this.f302a[r14].f60a = (f8 + f10) * 0.5f;
                    this.f302a[r14].b = (f9 + f11) * 0.5f;
                }
                break;
            case 2:
                ap apVar5 = this.b;
                al alVar = esVar2.f327a;
                this.a.f60a = (alVar.a.f60a * ebVar.f274a.f60a) + (alVar.b.f60a * ebVar.f274a.b);
                this.a.b = (alVar.a.b * ebVar.f274a.f60a) + (alVar.b.b * ebVar.f274a.b);
                ap apVar6 = ebVar.b;
                apVar5.f60a = esVar2.a.f60a + (esVar2.f327a.a.f60a * apVar6.f60a) + (esVar2.f327a.b.f60a * apVar6.b);
                apVar5.b = esVar2.a.b + (esVar2.f327a.a.b * apVar6.f60a) + (esVar2.f327a.b.b * apVar6.b);
                ap apVar7 = this.c;
                for (int r16 = 0; r16 < ebVar.f276b; r16++) {
                    apVar7.f60a = esVar.a.f60a + (esVar.f327a.a.f60a * ebVar.f273a[r16].a.f60a) + (esVar.f327a.b.f60a * ebVar.f273a[r16].a.b);
                    apVar7.b = esVar.a.b + (esVar.f327a.a.b * ebVar.f273a[r16].a.f60a) + (esVar.f327a.b.b * ebVar.f273a[r16].a.b);
                    float f12 = f2 - (((apVar7.f60a - apVar5.f60a) * this.a.f60a) + ((apVar7.b - apVar5.b) * this.a.b));
                    float f13 = (this.a.f60a * f12) + apVar7.f60a;
                    float f14 = (this.a.b * f12) + apVar7.b;
                    float f15 = ((-this.a.f60a) * f) + apVar7.f60a;
                    float f16 = ((-this.a.b) * f) + apVar7.b;
                    this.f302a[r16].f60a = (f15 + f13) * 0.5f;
                    this.f302a[r16].b = (f16 + f14) * 0.5f;
                }
                this.a.f60a = -this.a.f60a;
                this.a.b = -this.a.b;
                break;
        }
    }
}
