<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="UTF-8">
  <title>README - BankAccount</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      line-height: 1.6;
      max-width: 900px;
      margin: auto;
      padding: 20px;
      background-color: #f9f9f9;
      color: #333;
    }
    h1, h2, h3 {
      color: #2c3e50;
    }
    code {
      background-color: #eee;
      padding: 2px 6px;
      border-radius: 4px;
      font-family: monospace;
    }
    pre {
      background-color: #f4f4f4;
      padding: 10px;
      overflow-x: auto;
      border-left: 4px solid #007acc;
    }
    table {
      border-collapse: collapse;
      width: 100%;
      margin-top: 20px;
    }
    table, th, td {
      border: 1px solid #bbb;
    }
    th, td {
      padding: 8px;
      text-align: left;
    }
    th {
      background-color: #e0e0e0;
    }
    .note {
      background-color: #fff3cd;
      border-left: 6px solid #ffc107;
      padding: 10px;
      margin-top: 20px;
    }
  </style>
</head>
<body>

  <h1>💳 BankAccount – Sistema Simples de Conta Bancária</h1>

  <p>Este projeto Java simula um sistema bancário básico com suporte para operações como <strong>consultar saldo</strong>, <strong>sacar</strong>, <strong>depositar</strong>, <strong>pagar boletos</strong> e <strong>usar cheque especial</strong>. O código aplica conceitos fundamentais da <strong>Programação Orientada a Objetos (POO)</strong> como <em>encapsulamento</em>, <em>abstração</em> e <em>instanciação de objetos</em>.</p>

  <h2>🚀 Funcionalidades</h2>
  <ul>
    <li>Consultar saldo</li>
    <li>Consultar e usar cheque especial</li>
    <li>Depositar dinheiro</li>
    <li>Sacar dinheiro</li>
    <li>Pagar boletos</li>
    <li>Verificar uso do cheque especial</li>
  </ul>

  <h2>🧱 Estrutura da Classe <code>BankAccount</code></h2>

  <h3>Atributos privados (Encapsulamento)</h3>
  <pre><code>private double saldo;
private double limiteChequeEspecial;
private double dividaChequeEspecial;</code></pre>

  <p>Esses atributos representam o <strong>estado interno</strong> do objeto e são privados para garantir acesso controlado — um princípio do <em>encapsulamento</em>.</p>

  <h3>Construtor</h3>
  <pre><code>public BankAccount(double depositoInicial)</code></pre>
  <p>Cria uma conta com saldo inicial e define o limite do cheque especial com base nesse valor.</p>

  <h2>🔧 Métodos Públicos</h2>
  <ul>
    <li><code>consultarSaldo()</code>: Exibe o saldo atual</li>
    <li><code>consultarChequeEspecial()</code>: Mostra o limite e o valor usado</li>
    <li><code>depositar()</code>: Aceita depósitos, quitando dívidas do cheque especial se existirem</li>
    <li><code>sacar()</code>: Permite sacar valores válidos</li>
    <li><code>pagarBoleto()</code>: Paga boletos usando saldo e cheque especial</li>
    <li><code>verificarUsoCheque()</code>: Informa se há dívida no cheque especial</li>
  </ul>

  <h2>📌 Método <code>main</code></h2>
  <p>Simula a interação do usuário com a conta via menu interativo de opções.</p>

  <h2>💡 Conceitos de POO Aplicados</h2>

  <table>
    <thead>
      <tr>
        <th>Conceito</th>
        <th>Aplicação</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td><strong>Classe</strong></td>
        <td><code>BankAccount</code> representa uma conta bancária</td>
      </tr>
      <tr>
        <td><strong>Objeto</strong></td>
        <td><code>new BankAccount()</code> cria uma nova conta</td>
      </tr>
      <tr>
        <td><strong>Encapsulamento</strong></td>
        <td>Atributos privados e acesso via métodos públicos</td>
      </tr>
      <tr>
        <td><strong>Abstração</strong></td>
        <td>Interface simples para operações bancárias, escondendo a lógica interna</td>
      </tr>
      <tr>
        <td><strong>Instanciação</strong></td>
        <td>Criação de objetos com <code>new</code></td>
      </tr>
    </tbody>
  </table>
</body>
</html>
