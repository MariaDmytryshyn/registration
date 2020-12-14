kubectl apply -f ns-and-sa.yml
kubectl apply -f rbac.yml
kubectl apply -f default-server-secret.yml
kubectl apply -f nginx-config.yml
kubectl apply -f nginx-ingress.yml
kubectl apply -f ingress-resource.yml
kubectl apply -f ingress-service.yml
pause